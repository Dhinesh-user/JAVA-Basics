package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsToLoginPage {
	WebDriver Driver;

	@Given("Open application")
	public void Open_application() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-Maximized");
		Driver = new ChromeDriver(Options);
		Driver.get("https://petstore.octoperf.com/");
		System.out.println("application opened");
	}

	@When("Click on enter the store link")
	public void click_on_enter_the_store_link() {
		Driver.findElement(By.linkText("Enter the Store")).click();
		System.out.println("user clicked on enter the store link");
	}

	@When("Click on signon button")
	public void click_on_signon_button() {
		Driver.findElement(By.linkText("Sign In")).click();
		System.out.println("user clicked on sign on  button");
	}

	@Then("Navigate to login page")
	public void user_should_navigate_to_login_page() {
		String title = Driver.getTitle();
		if (title.equals("Jpetstore Demo")) {
			System.out.println("user navigated to Login page");
		} else {
			System.out.println("user not navigated to Login page");

		}
	}

//	@When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$") // with double quotes in feature file parameters
	@When("^Enter username (.*) and password (.*)$")  // without double quotes in feature file parameters
	public void enter_username_and_password(String username,String password) {
		Driver.findElement(By.xpath("//input[@name='username']")).click();
		Driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Driver.findElement(By.xpath("//input[@name='password']")).clear();
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("Click Login button")
	public void click_login_button() {
		Driver.findElement(By.xpath("//input[@name='signon']")).click();
	}

	@Then("Navigate to Home page")
	public void navigate_to_home_page() {
		String title=Driver.findElement(By.id("WelcomeContent")).getText();
		if (title.equals("ABC")) {
			System.out.println("ABC is displayed");
		} else {
			System.out.println("ABC is not displayed");

		}
	}

}
