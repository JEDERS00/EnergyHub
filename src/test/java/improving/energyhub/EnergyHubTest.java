package improving.energyhub;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author User
 */
public class EnergyHubTest {
    
    public EnergyHubTest() {
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
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain1() {
        String[] args = null;
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain2() {
        String[] args = {};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain3() {
        String[] args = {"hi"};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain4() {
        String[] args = {"hi", "how"};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain5() {
        String[] args = {"hi", "how", "are"};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain6() {
        String[] args = {"hi", "how", "are", "you"};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain7() {
        String[] args = {"hi", "how.are", "are"};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain8() {
        String[] args = {"ambientTemp", "how.are", "2016-01-01T03:18"};
        EnergyHub.main(args);
    }
    
    /**
     * Test of main method, of class EnergyHub.
     */
    @Test
    public void testMain9() {
        String[] args = {"ambientTemp", "thermostat-data.jsonl.gz", "2016-01-01T03:18"};
        EnergyHub.main(args);
    }
    
}
