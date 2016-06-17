package test.java;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.Selenium;

public class SeleniumStep {
	
	private String input1, input2;
	
	@Given("^a \"([^\"]*)\", \"([^\"]*)\"$")
	public void a(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    input1 = arg1;
	    input2 = arg2;
	    Selenium.setUp();
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Selenium.testSelenium(input1, input2, arg1);
	}

	@Then("^output equal \"([^\"]*)\"$")
	public void result_equal(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(arg1, Selenium.getResult());
	    Selenium.tearDown();
	}

}
