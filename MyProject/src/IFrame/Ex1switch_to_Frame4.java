package IFrame;
// switch to frame by  Frame Xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1switch_to_Frame4
{public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switch to frame
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]")));  //  Frame xpath
	
	// click on button
	driver.findElement(By.xpath("//button[contains(text(), 'Click me')]")).click();
	

	
	
	
}

}
