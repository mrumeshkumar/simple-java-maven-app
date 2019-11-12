package test.cucumber;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

/**
 * Main class to invoke the tests, and it must be run as JUnit TC's
 * 
 * @author arun.pandey
 */
@RunWith(Cucumber.class)

@CucumberOptions(format = { "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
, features = "src/test/java/resources/test/cucumber/calc/Calc.Feature")
public class RunCalculatorTest {

}
