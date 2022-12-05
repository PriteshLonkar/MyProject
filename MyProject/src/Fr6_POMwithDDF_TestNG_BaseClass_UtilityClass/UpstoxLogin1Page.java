package Fr6_POMwithDDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page 
{

	@FindBy(xpath="//input[@id='userCode']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	@FindBy(xpath="//button[@id='submit-btn']") private WebElement Login;
	
	
	public UpstoxLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpUpstox_Login1Page_UN(String Username) 
	{
		UN.sendKeys(Username);
	}
	
	public void inpUpstox_Login1Page_Pass(String Password) 
	{
		Pass.sendKeys(Password);
	}
	
	public void clickUpstox_Login1Page_Login() 
	{
		Login.click();
	}
}
