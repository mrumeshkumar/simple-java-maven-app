package test.cucumber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import test.cucumber.calc.*;
import cucumber.api.java.en.Then;

public class CalculatorStep {
	private Calculator calc;
	private int res;

	@Given("^I have a calc with (\\d+) (\\d+)$")
	public void I_have_a_calc_with(int arg1, int arg2) throws Throwable {
		calc = new Calculator(arg1, arg2);
	}

	@When("^I ask it to say add$")
	public void I_ask_it_to_say_add() throws Throwable {
		res = calc.add();
	}

	@Then("^it should answer with add (\\d+)$")
	public void it_should_answer_with_add(int expectedRes) throws Throwable {
		assertEquals(expectedRes, res);
	}

	@When("^I ask it to say subtract$")
	public void I_ask_it_to_say_subtract() throws Throwable {
		res = calc.subtract();
	}

	@Then("^it should answer with sub (\\d+)$")
	public void it_should_answer_with_sub(int expectedRes) throws Throwable {
		assertEquals(expectedRes, res);
	}

	@When("^I ask it to say multiply$")
	public void I_ask_it_to_say_multiply() throws Throwable {
		res = calc.multiply();
	}

	@Then("^it should answer with mul (\\d+)$")
	public void it_should_answer_with_mul(int expectedRes) throws Throwable {
		assertEquals(expectedRes, res);
	}

	@When("^I ask it to say divide$")
	public void I_ask_it_to_say_divide() throws Throwable {
		res = calc.divison();
	}

	@Then("^it should answer with div (\\d+)$")
	public void it_should_answer_with_div(int expectedRes) throws Throwable {
		assertEquals(expectedRes, res);
	}

}
