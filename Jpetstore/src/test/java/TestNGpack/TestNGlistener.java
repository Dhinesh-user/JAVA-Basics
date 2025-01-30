package TestNGpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//@Listeners(ListenerExample.class)
public class TestNGlistener {
    WebDriver driver;
    
	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-Maximized");
		WebDriver driver = new ChromeDriver(Options);
	}
	
	@Test(priority =4)  //Success Test
	public void CloseBrowser() {
		System.out.println("SuccessTest");
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test(priority =1) //Failed Test
	public void OpenBrowser() {
	        
	        driver.get("https://www.demoqa.com");
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	private int i = 1;

	
	@Test (priority = 2, successPercentage = 60, invocationCount = 1) //Failing Within Success
	public void AccountTest() {
			if(i < 3)
				Assert.assertEquals(i , 2);
		i++;
	}
	
	@Test(priority=3)  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
}

