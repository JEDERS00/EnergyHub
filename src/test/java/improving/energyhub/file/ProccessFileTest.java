package improving.energyhub.file;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author User
 */
@RunWith(Parameterized.class)
public class ProccessFileTest {
    
    @Parameterized.Parameters
    public static Iterable data() {
        String invalidFileMessage = "Invalid file, please make sure your file is of type .jsonl or jsonl.gz";
        String empty = "";
        String result82 = "82";
        String ambient = "ambient";
        String ambientTemp = "ambientTemp";
        String pathUncompressed = "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl";
        String pathCompressed = "src\\test\\java\\improving\\energyhub\\files\\thermostat-data.jsonl.gz";
        String selectValidFormat = "Please, select a valid format date";
        String date1 = "2016-01-01T";
        String date2 = "2016-01-01T03:18";
        String date3 = "201601010318";
        String date4 = "2016/01/01/03/18";
        String date5 = "2016//01//01//03//18";
        
        
        return Arrays.asList(new Object[][]{
            {invalidFileMessage, null, null, null}, 
            {invalidFileMessage, empty, null, null}, 
            {invalidFileMessage, empty, empty, null}, 
            {invalidFileMessage, empty, empty, empty}, 
            {invalidFileMessage, "search", empty, empty}, 
            {invalidFileMessage, "search", "path", empty}, 
            {invalidFileMessage, "search", "path", "date"}, 
            {selectValidFormat, ambientTemp, pathUncompressed, date1}, 
            {empty, ambient, pathUncompressed, date2}, 
            {result82, ambientTemp, pathUncompressed, date2},
            {result82, ambientTemp, pathUncompressed, date3}, 
            {result82, ambientTemp, pathUncompressed, date4}, 
            {result82, ambientTemp, pathUncompressed, date5}, 
            {selectValidFormat, ambientTemp, pathCompressed, date1}, 
            {empty, ambient, pathCompressed, date2}, 
            {result82, ambientTemp, pathCompressed, date2}, 
            {result82, ambientTemp, pathCompressed, date3}, 
            {result82, ambientTemp, pathCompressed, date4}, 
            {result82, ambientTemp, pathCompressed, date5}
        });
    }

    private String expResult;
    private String keyToSearch;
    private String pathFile;
    private String updateTime;

    public ProccessFileTest(String expResult, String keyToSearch, String pathFile, String updateTime) {
        this.expResult = expResult;
        this.keyToSearch = keyToSearch;
        this.pathFile = pathFile;
        this.updateTime = updateTime;
    }

    @Test
    public void testProcessFile(){
        String result = new ProccessFile().processFile(this.keyToSearch, this.pathFile, this.updateTime);
        assertEquals(this.expResult, result);
    }
    
}
