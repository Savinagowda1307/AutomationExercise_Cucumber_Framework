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

	
	
	
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement signUpEmailInputBox;
	public void setSignUpEmail(String email)
	{
		signUpEmailInputBox.sendKeys(email);
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement namelInputBox;
	public void setSName(String name)
	{
		namelInputBox.sendKeys(name);
	}
	
	
	

	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement signUpbtn;
	public void clickOnSignUpbtn()
	{
		signUpbtn.click();
	}
}
