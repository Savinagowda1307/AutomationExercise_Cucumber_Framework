package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement sigInOrLoGinLink;
	
	
	public void clickOnSignInOrLoginLink()
	{
		sigInOrLoGinLink.click();
	}
	
	@FindBy(xpath="//div[@class='choose']//a")
	public List<WebElement> viewCartBtns;
	
	
}
