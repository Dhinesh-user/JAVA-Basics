package TestRunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
				features="src/test/resources/Features/Withtags.feature",
				glue={"stepDefinitions"},
//				tags= "@Demo"
//				tags="@Demo and @Imp"
				tags ="@Demo or @Imp"
//				tags="not @Demo"
//				tags = "withtags" // feature level tags
				)
 
public class TestRunnerwithtags {

}
