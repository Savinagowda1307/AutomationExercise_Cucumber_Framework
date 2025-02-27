package stepsDefinition;

import factory.Basclass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Accountpage;
import pageObjects.Homepage;
import pageObjects.Loginpage;

public class Login {

	Accountpage ap;
	Homepage hp;
	Loginpage lp;
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		 hp=new Homepage(Basclass.getDriver());
		 hp.clickOnSignInOrLoginLink();
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pswd) {
		 lp=new Loginpage(Basclass.getDriver());
		 lp.setEmail(email);
		 lp.setPassword(pswd);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		 lp=new Loginpage(Basclass.getDriver());
		 lp.clickOnLoginBtn();
	}

	@Then("user nagigate to the my account page successfully")
	public void user_nagigate_to_the_my_account_page_successfully() {
		 ap= new Accountpage(Basclass.getDriver());
		 boolean stats=ap.getLoginStatusMsg();
		 Assert.assertEquals("Something wroen with login",true ,stats);
		 System.out.println("Logged in successfully");
	}

}
