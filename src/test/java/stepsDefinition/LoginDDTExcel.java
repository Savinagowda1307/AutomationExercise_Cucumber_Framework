package stepsDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import factory.Basclass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Accountpage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import utilities.Datareader;

public class LoginDDTExcel {
	Accountpage ap;
	Homepage hp;
	Loginpage lp;
	
	List<HashMap<String,String>>dataMap;
	@Given("the user is navigate to login page")
	public void the_user_is_navigate_to_login_page() {
		 hp=new Homepage(Basclass.getDriver());
		 hp.clickOnSignInOrLoginLink();
	}

	@Then("user should be redirected to the MyAccount page by passing email and password with excel row {string}")
	public void user_should_be_redirected_to_the_my_account_page_by_passing_email_and_password_with_excel_row(String row) {
	  
		try
		{
			dataMap=Datareader.data(System.getProperty("user.dir")+"\\testData\\loginDetails.xlsx", "Sheet1");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		 lp=new Loginpage(Basclass.getDriver());
		 
		 
		 int index=Integer.parseInt(row)-1;
		 String email=dataMap.get(index).get("Email");
		 String pswd=dataMap.get(index).get("Password");
		 
		 lp.setEmail(email);
		 lp.setPassword(pswd);
		 lp.clickOnLoginBtn();
		  ap=new Accountpage(Basclass.getDriver());
		 boolean status=ap.getLoginStatusMsg();

         if(status==true)
         {
        	 Assert.assertTrue(true);
        	 System.out.println("Succesfull login");
         }
         else
         {
        	 System.out.println("UnSuccesfull login");
        	 Assert.assertTrue(false);
         }
	}

}
