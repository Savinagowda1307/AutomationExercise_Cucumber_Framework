package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Basepage {
	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@class='product-information']/h2")
	WebElement productName;
	
	public String getProductName()
	{
	return 	productName.getText();
	}
	
	@FindBy(xpath="//button[@class='btn btn-default cart']")
	WebElement addToCartBtn;
	
	
	public void clickOnAddtoCart()
	{
		addToCartBtn.click();
		}
	
	
	@FindBy(xpath="//u[normalize-space()='View Cart']")
	WebElement viewCartBtn;
	
	public void clickOnviewCartBtn()
	{
		viewCartBtn.click();
		}
	
}
