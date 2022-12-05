package Fr6_POMwithDDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage 
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")  private WebElement PN;
	@FindBy(xpath="//div[@id='logout']") private WebElement Logout;
	
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String getUpstoxHomePageActPN() 
	{
		String text = PN.getText();
		return text;
	}
	
	
//	public void verifyUpstoxHomePageUserID(String expPN) 
//	{
//		String actPN = PN.getText();
//		if (actPN.contains(expPN)) 
//		{
//			System.out.println("Pass");
//		} 
//		else s
//		{
//			System.out.println("Fail");
//		}	
//	}
	
	public void ClickUpstox_HomePage_Logout() 
	{   PN.click();
		Logout.click();
	}

}