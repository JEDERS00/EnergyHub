package improving.energyhub.file;

import improving.energyhub.utils.FileUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author User
 */
public class CompressedFile implements FileFactory {

    @Override
    public Optional<BufferedReader> getFile(String path) {
        Optional<BufferedReader> optionaBuffer = Optional.empty();
        if (new FileUtils().isValidPath(path)) {
            try {
                InputStream fileStream = new FileInputStream(path);
                InputStream gzipStream = new GZIPInputStream(fileStream);
                Reader decoder = new InputStreamReader(gzipStream);
                BufferedReader br = new BufferedReader(decoder);
                optionaBuffer = Optional.ofNullable(br);
            } catch (IOException ex) {
                Logger.getLogger(CompressedFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return optionaBuffer;
    }

}
