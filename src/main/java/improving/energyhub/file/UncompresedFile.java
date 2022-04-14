package improving.energyhub.file;

import improving.energyhub.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class UncompresedFile implements FileFactory {

    @Override
    public Optional<BufferedReader> getFile(String path) {
        Optional<BufferedReader> optionaBuffer = Optional.empty();
        if (new FileUtils().isValidPath(path)) {
            try {
                File file = new File(path);
                BufferedReader br = new BufferedReader(new FileReader(file));
                optionaBuffer = Optional.ofNullable(br);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UncompresedFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return optionaBuffer;
    }

}
