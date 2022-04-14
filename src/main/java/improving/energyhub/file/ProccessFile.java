package improving.energyhub.file;

import improving.energyhub.utils.FileUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author User
 */
public class ProccessFile {

    public String processFile(String keyToSearch, String pathFile, String updateTime) {
        String errorMessage = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        if (StringUtils.isBlank(pathFile)) {
            return errorMessage;
        }
        String[] pathSplit = pathFile.split("\\.");
        FileUtils fileUtils = new FileUtils();
        if (fileUtils.isValidPath(pathSplit)) {
            FileFactory factory;
            if (fileUtils.isUncompressedFile(pathSplit[pathSplit.length - 1])) {
                factory = new UncompresedFile();
            } else {
                factory = new CompressedFile();
            }
            try {
                return getValue(keyToSearch, factory.getFile(pathFile), updateTime);
            } catch(IllegalArgumentException iae) {
                return iae.getMessage();
            }
        } else {
            return errorMessage;
        }
    }

    private String getValue(String keyToSearch, Optional<BufferedReader> optionalBR, String updateTime) throws IllegalArgumentException {
        if (optionalBR.isPresent()) {
            BufferedReader br = optionalBR.get();
            String stringLine;
            JSONObject jsonLine;
            JSONObject jsonUpdate;
            Optional<Date> optionalSearchTime = getOptionalDate(updateTime);
            if (optionalSearchTime.isPresent()) {
                Date searchTime = optionalSearchTime.get();
                Optional<Date> optionalRecordTime;
                Date recordTime;
                String tmpValue = "";
                String value;
                try {
                    while ((stringLine = br.readLine()) != null) {
                        jsonLine = new JSONObject(stringLine);
                        optionalRecordTime = getOptionalDate(jsonLine.optString("updateTime"));
                        if (optionalRecordTime.isPresent()) {
                            recordTime = optionalRecordTime.get();
                            jsonUpdate = jsonLine.optJSONObject("update");
                            value = jsonUpdate.optString(keyToSearch);
                            if (recordTime.compareTo(searchTime) <= 0) {
                                if (StringUtils.isNotBlank(value)) {
                                    tmpValue = value;
                                }
                            } else {
                                return tmpValue;
                            }
                        }
                    }
                } catch (JSONException je) {
                    Logger.getLogger(ProccessFile.class.getName()).log(Level.SEVERE, null, je);
                } catch(IOException ioE){
                    Logger.getLogger(ProccessFile.class.getName()).log(Level.SEVERE, null, ioE);
                } finally {
                    try {
                        br.close();
                    } catch (IOException ie) {
                        Logger.getLogger(ProccessFile.class.getName()).log(Level.SEVERE, null, ie);
                    }
                }
            }
        }
        return "";
    }

    private Optional<Date> getOptionalDate(String stringTime) throws IllegalArgumentException {
        Optional<Date> optionalDate = Optional.empty();
        if (StringUtils.isNotBlank(stringTime)) {
            try {
                String dateString = getCleanDate(stringTime);
                optionalDate = Optional.ofNullable(new SimpleDateFormat("yyyyMMddHHmm").parse(dateString));
            } catch (ParseException ex) {
                throw new IllegalArgumentException("Please, select a valid format date");
            }
        }
        return optionalDate;
    }
    
    private String getCleanDate(String stringTime) {
        int length = stringTime.length();
        StringBuilder cleanDate = new StringBuilder(length);
        int value;
        for (int position = 0; position < length; position++) {
            value = stringTime.charAt(position);
            if (value >= 48 && value <= 57) {
                cleanDate.append((char) value);
                if (cleanDate.length() == 12) {
                    break;
                }
            }
        }
        return cleanDate.toString();
    }
}
