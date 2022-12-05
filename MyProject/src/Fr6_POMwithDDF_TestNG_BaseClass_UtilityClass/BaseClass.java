package Fr6_POMwithDDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass 
{
	public WebDriver driver;
	public void InitializeBrowser()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
	 driver.get("https://login-v2.upstox.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
	 
	}

}
