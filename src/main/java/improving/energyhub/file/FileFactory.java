package improving.energyhub.file;

import java.io.BufferedReader;
import java.util.Optional;

/**
 *
 * @author User
 */
public interface FileFactory {
    
    public Optional<BufferedReader> getFile(String path);
    
}
