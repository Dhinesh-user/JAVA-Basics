package Stepdefinitions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatablewithoutheader {
	WebDriver Driver;

	@Given("Open browser and Launch URL")
	public void open_browser_and_launch_url() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-Maximized");
		Driver = new ChromeDriver(Options);
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("application opened");
	}

	@When("Enter below credentials")
	public void enter_below_credentials(DataTable dataTable) throws InterruptedException {
	
//	If we pass single line un and pw data we could use List of Strings	
	 List<String> cred = dataTable.asList(String.class);
	 String un = cred.get(0);
	 String pw = cred.get(1);
	 System.out.println(un);
	 System.out.println(pw);
	 Thread.sleep(2000);
	 Driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
     Driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pw);
		
//  If we pass multiple lines of un and pw data we could use List of List
//  The same feature alone run for all the data's we pass   
//	 List<List<String>> credens = dataTable.asLists(String.class);
//		for(List<String> creds:credens) {
//			String un1 = creds.get(0);
//			String pw1 = creds.get(1);
//			 System.out.println(un1);
//			 System.out.println(pw1);
//			 Thread.sleep(5000);
//			 Driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un1);
//			 Driver.findElement(By.xpath("//input[@name = 'username']")).clear();
//			 Driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pw1);
//			 Driver.findElement(By.xpath("//input[@name = 'password']")).clear();
			 
//		}
	

	}

	@When("click Login button")
	public void click_login_button() {
	   
	}

	@Then("you are in home page")
	public void you_are_in_home_page() {
	  
	}
}
