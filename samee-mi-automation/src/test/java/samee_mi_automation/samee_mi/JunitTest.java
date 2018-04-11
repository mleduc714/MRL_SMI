package samee_mi_automation.samee_mi;
import org.junit.Test;

import pages.MILoginPage;

public class JunitTest {

    @Test
    public void testConcatenate() {
     
    	new MILoginPage("http://localhost:8080/math_inventory/loader","chrome");
    
        

    }
}