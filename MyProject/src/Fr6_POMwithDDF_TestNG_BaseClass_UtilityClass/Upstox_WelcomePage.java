package Fr6_POMwithDDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_WelcomePage
{

	@FindBy(xpath="(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]") private WebElement NoIam;
	
	public Upstox_WelcomePage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickUpstox_WelcomePage()
	{
		NoIam.click();
		
	}
	
}

