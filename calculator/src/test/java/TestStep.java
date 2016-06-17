package test.java;

import static org.junit.Assert.*;

import calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStep {
	
	private static final double DELTA = 1e-15;
	
	private double result;
	
	@Given("^a string of \"([^\"]*)\"$")
	public void a_string_of(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Calculator calc = new Calculator();
		result = calc.calculate(arg1);
	}

	@Then("^result equal \"([^\"]*)\"$")
	public void result_equal(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(Double.parseDouble(arg1), result, DELTA);
	}
}
