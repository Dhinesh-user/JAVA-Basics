package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	@Given("user enters page")
	public void user_enters_page() {
	    System.out.println("User enters home page");
	}

	@When("user enter data")
	public void user_enter_data() {
	   System.out.println("user enters data");
	}

	@Then("user verify")
	public void user_verify() {
	 System.out.println("User verifies");
	}
	@Given("user enters Home page")
	public void user_enters_home_page() {
	    System.out.println("user enters home");
	}

	@When("user enter valid data")
	public void user_enter_valid_data() {
	   System.out.println("user enters valid data");
	}

	@Then("user verify message")
	public void user_verify_message() {
	   System.out.println("user verify message");
	}

}
