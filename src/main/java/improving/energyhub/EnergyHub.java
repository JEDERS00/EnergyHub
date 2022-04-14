package improving.energyhub;

import improving.energyhub.file.ProccessFile;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author User
 */
public class EnergyHub {

    public static void main(String[] args) {
        if (args == null || args.length != 3) {
            System.out.print("Plase add the value to search, the file location and the date time to do the search.");
        } else {
            String keyToSearch = args[0];
            String path = args[1];
            String timeToSearch = args[2];
            String value = new ProccessFile().processFile(keyToSearch, path, timeToSearch);
//            String value = new ProccessFile().processFile("ambientTemp", "C:\\Users\\User\\Downloads\\thermostat-data.jsonl.gz", "2016-01-01T03:18");
//            String value = new ProccessFile().processFile("ambientTemp", "C:\\Users\\User\\Desktop\\thermostat-data.jsonl", "2016-01-01T03:18");
//            String value = new ProccessFile().processFile("ambientTemp", "C:\\Users\\User\\Desktop\\test.jsonl", "2016-01-01T03:18");
            if (StringUtils.isBlank(value)) {
                System.out.println("No " + keyToSearch +" information found.");
            } else {
                System.out.println(value);
            }
        }
    }
}
