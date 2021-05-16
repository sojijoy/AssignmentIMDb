package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegistrationPage;

public class RegistrationDefinition {
	
	RegistrationPage register;
	@Given("^User is on imdbpage$")
	public void user_is_on_imdbpage() throws Throwable {
	    register= new RegistrationPage();
	    
	}
	
	@Given("^User clicks on create account link$")
	public void user_clicks_on_create_account_link() throws Throwable {
	  register.createAcc();
	}

	@When("^User enters the \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_the(String name, String email, String pwd, String pwdchk) throws Throwable {
		register.name(name);
		register.email(email);
		register.password(pwd);
		register.passwordCheck(pwdchk);
	
	}
	
	@When("^User enters the captacha$")
	public void user_enters_the_captacha() throws Throwable {
	  register.captcha();
	}

	@When("^clicks on Continue$")
	public void clicks_on_Continue() throws Throwable {
	   register.continueButton();
	}

	@When("^User enters signup button$")
	public void user_enters_signup_button() throws Throwable {
	   register.signUp();
	}
	
	@When("^User enters the OTP and clicks on create$")
	public void user_enters_the_OTP_and_clicks_on_create() throws Throwable {
	   register.verifyMail();
	}

	@Then("^User is directed to homepage$")
	public void user_is_directed_to_homepage() throws Throwable {
		register.getTitle();
	   
	}


}
