package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;

public class Datatablewithheader {
	WebDriver Driver;
	@Given("Open browser and Launch OrangeHRM URL")
	public void open_browser_and_launch_orange_hrm_url() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-Maximized");
		Driver = new ChromeDriver(Options);
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("application opened");
	}

	@When("user enter below credentials")
	public void user_enter_below_credentials(DataTable dataTable) throws InterruptedException {
	  
// If We pass multiple lines of Keyvaluepair, List of Maps with for loop or for each loop
	List<Map<String,String>> Keyvaluepair = dataTable.asMaps(String.class,String.class);
	  
//	   Map<String, String> Keyvaluepair = dataTable.asMap(String.class,String.class);
	   
	   int size=Keyvaluepair.size();
	   System.out.println(size);
	   for(int i=0;i<size;i++) {
	   String un = Keyvaluepair.get(i).get("username");
	   String pw = Keyvaluepair.get(i).get("password");

	   System.out.println(un);
	   System.out.println(pw);
	   Thread.sleep(5000);
	   Driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
	   Driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pw);
	   }
// If we pass single line of keyvalue pair, use List of maps with index zero concept 
//	   List<Map<String,String>> Keyvaluepair = dataTable.asMaps(String.class,String.class);
//	   int size=Keyvaluepair.size();
//	   System.out.println(size);
//	   
//	   String un = Keyvaluepair.get(0).get("username");
//	   String pw = Keyvaluepair.get(0).get("password");
//	   String un1 = Keyvaluepair.get(1).get("username");
//	   String pw1 = Keyvaluepair.get(1).get("password");
//	   Driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
//	   Driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pw);
	   
	}

	@When("user click Login button")
	public void user_click_login_button() {
	  
	}

	@Then("user is in home page")
	public void user_is_in_home_page() {
	  
	}
}
