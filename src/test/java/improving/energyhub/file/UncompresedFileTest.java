package improving.energyhub.file;

import java.io.BufferedReader;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class UncompresedFileTest {
    
    public UncompresedFileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFile method, of class UncompresedFile.
     */
    @Test
    public void testGetFile1() {
        Optional<BufferedReader> expResult = Optional.empty();
        Optional<BufferedReader> result = new UncompresedFile().getFile(null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFile method, of class UncompresedFile.
     */
    @Test
    public void testGetFile2() {
        Optional<BufferedReader> expResult = Optional.empty();
        Optional<BufferedReader> result = new UncompresedFile().getFile("");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getFile method, of class UncompresedFile.
     */
    @Test
    public void testGetFile3() {
        Optional<BufferedReader> expResult = Optional.empty();
        Optional<BufferedReader> result = new UncompresedFile().getFile("hi");
        assertEquals(expResult, result);
    }
    
}
