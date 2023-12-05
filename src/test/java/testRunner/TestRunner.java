package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D://Eclipse Workspace//Ecommerce.cucumberBDD.framework//src//test//java//Features//OrangeHRM.feature",
		glue  =    "StepDefinition"
		)
public class TestRunner {

}
