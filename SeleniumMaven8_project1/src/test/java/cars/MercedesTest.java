package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MercedesTest 
{
     @Test(groups = "System")
     public void mercedes()
     {
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	 
    	 driver.get("https://www.mercedes-benz.com/en/");
    	 Reporter.log("mercedes car home page is displayed",true);
     }
}
