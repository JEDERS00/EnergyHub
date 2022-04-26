package improving.energyhub.utils;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author User
 */
@RunWith(Parameterized.class)
public class FileUtilsTest {
    
    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {false, null}, 
            {false, ""}, 
            {false, "hi"},
            {true, "name.jsonl"},
            {true, "name.jsonl.gz"}
        });
    }

    private boolean expResult;
    private String path;

    public FileUtilsTest(boolean expResult, String path) {
        this.expResult = expResult;
        this.path = path;
    }

    @Test
    public void testIsValidPath(){
        boolean result = new FileUtils().isValidPath(this.path);
        assertEquals(this.expResult, result);
    }
    
    /**
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath_StringArr() {
        boolean result = false;
        if (StringUtils.isNotBlank(this.path)) {
            String[] pathSplit = this.path.split("\\.");
            result = new FileUtils().isValidPath(pathSplit);
        }
        assertEquals(this.expResult, result);
    }
    
}
