//importing libraries
import org.junit.Test;
import static org.junit.Assert.*;

//tTest class
public class DBTest {

    @Test
    public void cTest() {

        //making object
        SmartCrawler sc = new SmartCrawler("/Users/Mubbashi10");
        assertEquals(true, sc.DBStatus("FileIndex","root","ralf19"));

    }
}