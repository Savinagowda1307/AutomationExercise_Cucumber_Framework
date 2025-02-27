package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountpage extends Basepage{

	public Accountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement accountStatusMsg;
	

	public boolean getAccountCreatedMsg()
	{
		return accountStatusMsg.isDisplayed();
	}
	
	

	@FindBy(xpath="//li//i[@class='fa fa-user']")
	WebElement loginStatusMsg;
	

	public boolean getLoginStatusMsg()
	{
		return loginStatusMsg.isDisplayed();
	}
	
	
}
