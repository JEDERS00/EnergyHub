package improving.energyhub.utils;

import java.util.Date;
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
public class FileUtilsTest {
    
    public FileUtilsTest() {
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
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath1() {
        String path = null;
        boolean expResult = false;
        boolean result = new FileUtils().isValidPath(path);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath2() {
        boolean expResult = false;
        boolean result = new FileUtils().isValidPath("");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath3() {
        boolean expResult = false;
        boolean result = new FileUtils().isValidPath("hi");
        assertEquals(expResult, result);
    }
    

    /**
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath_StringArr1() {
        String[] path = null;
        boolean expResult = false;
        boolean result = new FileUtils().isValidPath(path);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath_StringArr2() {
        String[] path = {"", null};
        boolean expResult = false;
        boolean result = new FileUtils().isValidPath(path);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isValidPath method, of class FileUtils.
     */
    @Test
    public void testIsValidPath_StringArr3() {
        String[] path = {"", ""};
        boolean expResult = false;
        boolean result = new FileUtils().isValidPath(path);
        assertEquals(expResult, result);
    }

    /**
     * Test of isUncompressedFile method, of class FileUtils.
     */
    @Test
    public void testIsUncompressedFile1() {
        boolean expResult = false;
        boolean result = new FileUtils().isUncompressedFile(null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isUncompressedFile method, of class FileUtils.
     */
    @Test
    public void testIsUncompressedFile2() {
        boolean expResult = false;
        boolean result = new FileUtils().isUncompressedFile("");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isUncompressedFile method, of class FileUtils.
     */
    @Test
    public void testIsUncompressedFile3() {
        boolean expResult = false;
        boolean result = new FileUtils().isUncompressedFile("hi");
        assertEquals(expResult, result);
    }

}
