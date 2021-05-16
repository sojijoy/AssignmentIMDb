package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginDefinition {
	
	LoginPage login;
	@Given("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	    login= new LoginPage();
	    login.signinbutton();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String pwd) throws Throwable {
	  login.email(email);
	  login.password(pwd);
	}

	@When("^User enters signin button$")
	public void user_enters_signin_button() throws Throwable {
	    login.signin();
	}
	
	/*@When("^User re enters \"([^\"]*)\"$")
	public void user_re_enters(String pwd1) throws Throwable {
	   login.reEnter(pwd1);
	}

	@When("^User enters captacha and click continue$")
	public void user_enters_captacha_and_click_continue() throws Throwable {
	    login.captcha();
	}*/


	@Then("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
	    login.getTitle();
	}
	
	@When("^User clicks on Menu and selects Top Rated Movies$")
	public void user_clicks_on_Menu_and_selects_Top_Rated_Movies() throws Throwable {
	    login.menu();
	}
	
	@When("^sort by release date$")
	public void sort_by_release_date() throws Throwable {
	  login.sort();
	}

	@When("^User scrolls down to the least rated movie and clicks on it$")
	public void user_scrolls_down_to_the_least_rated_movie_and_clicks_on_it() throws Throwable {
	    login.leastRated();
	}

	@Then("^User is navigated to the movie page and release date is printed in console$")
	public void user_is_navigated_to_the_movie_page_and_release_date_is_printed_in_console() throws Throwable {
	    
	}
}