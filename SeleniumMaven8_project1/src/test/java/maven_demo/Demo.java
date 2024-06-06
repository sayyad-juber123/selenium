package maven_demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
   @Test
   public void test()
   {
	   Reporter.log("sample test executed",true);
   }
}
