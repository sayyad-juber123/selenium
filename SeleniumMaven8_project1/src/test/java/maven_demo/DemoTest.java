package maven_demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest 
{
     @Test
     public void test()
     {
    	 Reporter.log("sampleTest class is executed",true);
     }
}
