package testcases;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testfileclassjava {
	
	
	WebDriver driver;
@Before
public void mm()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Workplace\\lib\\chromedriver.exe");
	
	 driver= new ChromeDriver();
	 
	 driver.get("https://www.facebook.com");
	}
@After
public void mms()
{
	driver.close();
	}
	

@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("1");
}

@Given("^some other precondition$")
public void some_other_precondition() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("1");
}

@When("^I complete action$")
public void i_complete_action() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("2");
}

@When("^some other action$")
public void some_other_action() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("3");
}

@When("^yet another action$")
public void yet_another_action() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("4");
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("5");
}

@Then("^check more outcomes$")
public void check_more_outcomes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("6");
}

@Given("^I want to write a step with name(\\d+)$")
public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("7");
}

@When("^I check for the (\\d+) in step$")
public void i_check_for_the_in_step(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("1");
}

@Then("^I verify the success in step$")
public void i_verify_the_success_in_step() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("8");
}

@Then("^I verify the Fail in step$")
public void i_verify_the_Fail_in_step() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("9");
}




}
