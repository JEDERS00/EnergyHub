package improving.energyhub.utils;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author User
 */
public class FileUtils {

    public boolean isValidPath(String path) {
        if (StringUtils.isBlank(path)) {
            return false;
        }
        String[] pathSplit = path.split("\\.");
        return isValidPath(pathSplit);
    }

    public boolean isValidPath(String... path) {
        if (path == null) {
            return false;
        }
        if (path.length < 2) {
            return false;
        }
        if ("jsonl".equals(path[path.length - 1])) {
            return true;
        } else {
            return "gz".equals(path[path.length - 1]) && "jsonl".equals(path[path.length - 2]);
        }
    }

    public boolean isUncompressedFile(String path1) {
        return "jsonl".equals(path1);
    }

}
