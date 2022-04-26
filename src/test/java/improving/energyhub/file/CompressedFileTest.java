package improving.energyhub.file;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author User
 */
@RunWith(Parameterized.class)
public class CompressedFileTest {

    @Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{
            {null}, 
            {""}, 
            {"hi"}
        });
    }

    private String testValue;

    public CompressedFileTest(String testValue) {
        this.testValue = testValue;
    }

    @Test
    public void testGetFile(){
        Optional<BufferedReader> result = new CompressedFile().getFile(this.testValue);
        Optional<BufferedReader> expResult = Optional.empty();
        assertEquals(expResult, result);
    }
    
}
