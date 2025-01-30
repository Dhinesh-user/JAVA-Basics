package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="src/test/resources/Features/WithHooks.feature",
				glue={"Stepdefinitions","Hookspackage"},
				tags= "@Hooks" 
				)
 
public class Runnerwithhooks {
	
}
