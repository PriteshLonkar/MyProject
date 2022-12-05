package IFrame;
// switch to frame by String Frame ID
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1switch_to_Frame2
{public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switch to frame
	
	driver.switchTo().frame("iframeResult");  // string Frame ID
	
	driver.findElement(By.xpath("//button[contains(text(), 'Click me')]")).click();
	
	
	
}

}
