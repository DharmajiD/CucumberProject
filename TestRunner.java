package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@Cucumber.Options(format={"html:output"})
//@Cucumber.Options(features= "src/StepDefinitions", tags="@Registration, @Login",  format = {"pretty"} )
//@Cucumber.Options(features= "src/StepDefinitions", tags="@SumOfTwoNumbers",  format = {"pretty"} )


public class TestRunner {

}

/**
 * 	Scenario Outline – This is used to run the same scenario for 2 or more different set of test data. 
 * 	E.g. In our scenario, if you want to register another user you can data drive the same scenario twice.
	Examples – All scenario outlines have to be followed with the Examples section. 
	This contains the data that has to be passed on to the scenario.
 * 
 */
