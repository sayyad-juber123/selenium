package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborghiniTest 
{
  @Test(groups = "System")
  public void lambo()
  {
	  WebDriver driver = new ChromeDriver();
  	driver.manage().window().maximize();
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  	
  	driver.get("https://www.lamborghini.com/en-en");
  	Reporter.log("lamborghini home page is displayed",true);
  }
}
