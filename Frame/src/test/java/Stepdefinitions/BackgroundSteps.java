package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

	@Given("Have to complete SSLC")
	public void have_to_complete_sslc() {
	  System.out.println("Have to complete SSLC");
	}

	@Given("Have to complete HSC")
	public void have_to_complete_hsc() {
		System.out.println("Have to complete HSC");
	}

	@Given("Score good medical cutoff")
	public void score_good_medical_cutoff() {
		System.out.println("Score good medical cutoff");
	}

	@When("Apply Medical institute")
	public void apply_medical_institute() {
		System.out.println("Apply Medical institute");
	}

	@Then("Become a good doctor")
	public void become_a_good_doctor() {
		System.out.println("Become a good doctor");
	}

	@Given("Score good Engineering cutoff")
	public void score_good_engineering_cutoff() {
		System.out.println("Score good Engineering cutoff");
	}

	@When("Apply Engineering institute")
	public void apply_engineering_institute() {
		System.out.println("Apply Engineering institute");
	}

	@Then("Become a good Engineer")
	public void become_a_good_engineer() {
		System.out.println("Become a good Engineer");
	}

}
