package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUppage extends Basepage{

	public SignUppage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	Select options;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement genderBtn;
	public void clickOnGenderBtn()
	{
		genderBtn.click();
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pswdInputBox;
	public void setPassword(String pswd)
	{
		pswdInputBox.sendKeys(pswd);
	}
	
	

	
	@FindBy(xpath="//select[@id='days']")
	WebElement days;
	public void setDay(String day)
	{
		options=new Select(days);
		options.selectByVisibleText(day);
	}
	
	
	
	@FindBy(xpath="//select[@id='months']")
	WebElement months;
	public void setMonth(String month)
	{
		options=new Select(months);
		options.selectByVisibleText(month);
	}
	
	
	@FindBy(xpath="//select[@id='years']")
	WebElement years;
	public void setYear(String year)
	{
		options=new Select(years);
		options.selectByVisibleText(year);
	}
	
	
	
	
	
	
	
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement fnameInputBox;
	public void setfnameInputBox(String fname)
	{
		fnameInputBox.sendKeys(fname);
	}
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lnameInputBox;
	public void setlnameInputBox(String lname)
	{
		lnameInputBox.sendKeys(lname);
	}
	@FindBy(xpath="//input[@id='company']")
	WebElement compnayinputtBox;
	public void setCompany(String company)
	{
		compnayinputtBox.sendKeys(company);
	}
	@FindBy(xpath="//input[@id='address1']")
	WebElement adress1InputBox;
	public void setadress1(String adress1)
	{
		adress1InputBox.sendKeys(adress1);
	}
	@FindBy(xpath="//input[@id='address2']")
	WebElement adress2InputBox;
	public void setadress2(String adress2)
	{
		adress2InputBox.sendKeys(adress2);
	}
	@FindBy(xpath="//input[@id='state']")
	WebElement stateInputBox;
	public void setstateInputBox(String state)
	{
		stateInputBox.sendKeys(state);
	}
	@FindBy(xpath="//input[@id='city']")
	WebElement cityInputBox;
	public void setcityInputBox(String city)
	{
		cityInputBox.sendKeys(city);
	}
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipCodeInputBox;
	public void setzipCodeInputBox(String zipCode)
	{
		zipCodeInputBox.sendKeys(zipCode);
	}
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement mobileInputBox;
	public void mobileInputBox(String mbl)
	{
		mobileInputBox.sendKeys(mbl);
	}
	
	
	

	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement createAccountBtn;
	public void clickOnCreateAccountBtn()
	{
		createAccountBtn.click();
	}
	
}
