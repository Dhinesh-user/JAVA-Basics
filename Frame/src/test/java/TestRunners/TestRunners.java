package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/petlogin.feature",
		glue= "Stepdefinitions",
		plugin= {"pretty",
				"html:target/Reports/LoginPetstore.html",
				"json:target/Reports/Logpet.json",
				"junit:target/Reports/Loginpet.xml"
				}
		
		)

public class TestRunners {
	

}
