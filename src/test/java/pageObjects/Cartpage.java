package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartpage extends Basepage{

	public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//td[@class='cart_description']/h4")
	WebElement productName;
	

	public String getCartProductName()
	{
		return productName.getText();
	}
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement deleTeProduct;
	

	public void clickOnDeleteProduct()
	{
		deleTeProduct.click();
	}
	

}
