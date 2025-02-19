package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement EmailInputBox;
	public void setEmail(String email)
	{
		EmailInputBox.sendKeys(email);
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pswdInputBox;
	public void setPassword(String pswd)
	{
		pswdInputBox.sendKeys(pswd);
	}
	
	
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginBtn;
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}

	
	

}
