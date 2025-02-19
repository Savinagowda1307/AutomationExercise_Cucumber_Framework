package stepsDefinition;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import factory.Basclass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Cartpage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ProductPage;

public class AddToCart2 {
Homepage hp;
Loginpage lp;
ProductPage pp;
Properties p;
Cartpage cp;
String pName;
	@Given("User shoulb be logged into the login page")
	public void user_shoulb_be_logged_into_the_login_page() throws IOException {
		
	    hp=new Homepage(Basclass.getDriver());
	    lp=new Loginpage(Basclass.getDriver());
	    p=Basclass.getProperties();
	    hp.clickOnSignInOrLoginLink();
	    lp.setEmail(p.getProperty("email"));
	    lp.setPassword(p.getProperty("pswd"));
	    lp.clickOnLoginBtn();
	}

	@When("user add {string} to the cart")
	public void user_add_to_the_cart(String pruductName) {
		 hp=new Homepage(Basclass.getDriver());
		 pp=new ProductPage(Basclass.getDriver());
		 boolean found=false;
		 pName=pruductName.replaceAll("[\\s-]", "");
	   //System.out.println(p);
	   for(WebElement bt:hp.viewCartBtns)
	   {
		   bt.click();
		   String p2=pp.getProductName().replaceAll("[\\s-]", "");
		   if(p2.equalsIgnoreCase(pName))
		   {
			   pp.clickOnAddtoCart();
			   pp.clickOnviewCartBtn();
			   found=true;
			   System.out.println("found:"+pruductName);
			   break;
		   }
		   else
			   
			   Basclass.getDriver().navigate().back();
		   
	   }
	   if(found==false)
	   {
		   System.out.println("there is no product Named:"+pruductName);
		   Assert.assertTrue(found);
	   }
	   
	}

	@Then("user able to see the same product on the cart page")
	public void user_able_to_see_the_same_product_on_the_cart_page() {
	   
		cp=new Cartpage(Basclass.getDriver());
		String cartProductName=cp.getCartProductName().replaceAll("[\\s-]", "");
		if(cartProductName.equals(pName))
		{
			Assert.assertTrue(true);
			System.out.println("product Name is matching");
			cp.clickOnDeleteProduct();
		}
		else
		{
			try
			{
				cp.clickOnDeleteProduct();
			}
			catch(Exception e)
			{
				
			}
			Assert.assertTrue(false);
		}
	}
}

/*@When("user add {string} to the cart")
	public void user_add_to_the_cart(String pruductName) {
		 hp=new Homepage(Basclass.getDriver());
		 pp=new ProductPage(Basclass.getDriver());
		 boolean found=false;
		 pName=pruductName.replaceAll("[\\s-]", "");
	   //System.out.println(p);
	   for(WebElement bt:hp.viewCartBtns)
	   {
		   bt.click();
		   String p2=pp.getProductName().replaceAll("[\\s-]", "");
		   if(p2.equalsIgnoreCase(pName))
		   {
			   pp.clickOnAddtoCart();
			   pp.clickOnviewCartBtn();
			   found=true;
			   System.out.println("found:"+pruductName);
			   break;
		   }
		   else
			   Basclass.getDriver().navigate().back();
		   
	   }
	   if(found==false)
	   {
		   System.out.println("there is no product Named:"+pruductName);
	   }
	   
	}

*/