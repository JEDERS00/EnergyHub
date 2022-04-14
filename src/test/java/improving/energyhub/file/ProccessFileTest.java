package improving.energyhub.file;

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
public class ProccessFileTest {
    
    public ProccessFileTest() {
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
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile1() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile(null, null, null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile2() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile("", null, null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile3() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile("", "", null);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile4() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile("", "", "");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile5() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile("search", "", "");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile6() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile("search", "path", "");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile7() {
        String expResult = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String result = new ProccessFile().processFile("search", "path", "date");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile8() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl", "2016-01-01T03:18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile9() {
        String expResult = "";
        String result = new ProccessFile().processFile("ambient", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl", "2016-01-01T03:18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile10() {
        String expResult = "Please, select a valid format date";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl", "2016-01-01T");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile11() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl", "201601010318");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile12() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl", "2016/01/01/03/18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile13() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl", "2016//01//01//03//18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile14() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz", "2016-01-01T03:18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile15() {
        String expResult = "";
        String result = new ProccessFile().processFile("ambient", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz", "2016-01-01T03:18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile16() {
        String expResult = "Please, select a valid format date";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz", "2016-01-01T");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile17() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz", "201601010318");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile18() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz", "2016/01/01/03/18");
        assertEquals(expResult, result);
    }
    
    /**
     * Test of processFile method, of class ProccessFile.
     */
    @Test
    public void testProcessFile19() {
        String expResult = "82";
        String result = new ProccessFile().processFile("ambientTemp", "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz", "2016//01//01//03//18");
        assertEquals(expResult, result);
    }
    
}
