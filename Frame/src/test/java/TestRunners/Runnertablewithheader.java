package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Datatablewithheader.feature",
		glue="Stepdefinitions",
		dryRun = false ,
		monochrome = false,
		plugin= {"pretty","html:target/Reports/OrangeHRM.html"})
   
public class Runnertablewithheader {

}
