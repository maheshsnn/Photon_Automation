package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class pranaystepdefination {

	@Given("I am a facebook user")
	public void i_am_a_facebook_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I enter username as username")
	public void i_enter_username_as_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("^I enter the password as the password $")
    public void i_enter_the_password_as_the_password() throws Throwable {
        throw new PendingException();
    }
	@Then("^I should be redirected to the home page of facebook$")
    public void i_should_be_redirected_to_the_home_page_of_facebook() throws Throwable {
        throw new PendingException();
    }
}