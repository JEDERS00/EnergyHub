package improving.energyhub;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author User
 */
@RunWith(Parameterized.class)
public class EnergyHubTest {
    
    @Parameterized.Parameters
    public static Iterable data() {
        String hi = "hi";
        String how = "how";
        String are = "are";
        String howAre = "how.are";
        String ambientTemp = "ambientTemp";
        String date = "2016-01-01T03:18";
        
        
        return Arrays.asList(new Object[][]{
            {null, null, null, null}, 
            {hi, null, null, null},
            {hi, how, null, null},
            {hi, how, are, null},
            {hi, how, are, "you"},
            {hi, howAre, are, null},
            {ambientTemp, howAre, date, null},
            {ambientTemp, "thermostat-data.jsonl.gz", date, null}
        });
    }
    
    private String parameter1;
    private String parameter2;
    private String parameter3;
    private String parameter4;

    public EnergyHubTest(String parameter1, String parameter2, String parameter3, String parameter4) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
        this.parameter4 = parameter4;
    }

    @Test
    public void testMain(){
        String[] args = {this.parameter1, this.parameter2, this.parameter3,  this.parameter4};
        EnergyHub.main(args);
    }
    
}
