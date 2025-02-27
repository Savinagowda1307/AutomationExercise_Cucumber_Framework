package stepsDefinition;

import java.util.Map;

import factory.Basclass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Accountpage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.SignUppage;

public class Register {
	SignUppage sp;
	 Homepage hp;
	 Loginpage lp;
	 Accountpage ap;
	@Given("user should be on registraion page")
	public void user_should_be_on_registraion_page() {
	    hp=new Homepage(Basclass.getDriver());
	    hp.clickOnSignInOrLoginLink();
	}

	@When("user enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
		
		Map<String,String> dataMap=dataTable.asMap(String.class,String.class);
		 lp=new Loginpage(Basclass.getDriver());
		 lp.setSignUpEmail(Basclass.returnRandomString()+"@gmail.com");
		
		 lp.setSName(dataMap.get("Name"));
		 lp.clickOnSignUpbtn();
		 sp=new SignUppage(Basclass.getDriver());
		 sp.clickOnGenderBtn();
		 sp.setPassword(dataMap.get("Password"));
		 sp.setDay(dataMap.get("Day"));
		 sp.setMonth(dataMap.get("Month"));
		 sp.setYear(dataMap.get("Year"));
		 sp.setfnameInputBox(dataMap.get("Fname"));
		 sp.setlnameInputBox(dataMap.get("Lame"));
		 sp.setCompany("Capgemini");
		 sp.setadress1(dataMap.get("Adress1"));
		 sp.setadress2(dataMap.get("Adress2"));
		 sp.setstateInputBox(dataMap.get("state"));
		 sp.setcityInputBox(dataMap.get("city"));
		 sp.setzipCodeInputBox(dataMap.get("zipcode"));
		 sp.mobileInputBox(dataMap.get("mobile Number"));
		
	}

	@When("user clicks on create account button")
	public void user_clicks_on_create_account_button() {
		 sp=new SignUppage(Basclass.getDriver());
		 sp.clickOnCreateAccountBtn();
	}

	@Then("user account get created successfully")
	public void user_account_get_created_successfully() {
		  ap=new Accountpage(Basclass.getDriver());
		  boolean status=ap.getAccountCreatedMsg();
		  Assert.assertEquals("Something is wrong with Account creation",true, status);
		  System.out.println("Account created successfully");
	}



}
