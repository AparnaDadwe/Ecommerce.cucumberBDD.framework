package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Login.feature",
		glue  =    "StepDefinition",
		dryRun = false, //dryRun is for specify all method every feature file contain every step definition or not
		monochrome = true,//it will remove the unnecessary character from console window
		plugin = {"pretty","html:test-output"}
		
		)
public class EcommerceTestRunner {
          
}
