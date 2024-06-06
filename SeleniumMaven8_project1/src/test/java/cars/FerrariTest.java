package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariTest 
{
     @Test(groups = "Smoke")
     public void ferrari()
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	 
    	 driver.get("https://www.ferrari.com/en-IN");
    	 Reporter.log("ferrari home page is displayed",true);
     }
}
