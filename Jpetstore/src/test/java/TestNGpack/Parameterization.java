package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {

	WebDriver dr;

	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-Maximized");
		dr = new ChromeDriver(Options);
		dr.get("https://petstore.octoperf.com/");
		dr.findElement(By.linkText("Enter the Store")).click();
		System.out.println("Launched App successfully");

	}

	@BeforeMethod
	@Parameters({"UserName", "Password"})
	public void Login(String Un, String Pwd){
//	@Parameters("UserName")
//	public void Login(String Un){

		dr.findElement(By.linkText("Sign In")).click();
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys(Un);
		dr.findElement(By.xpath("//input[@name='password']")).clear();
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
		dr.findElement(By.xpath("//input[@name='signon']")).click();
		System.out.println("XML Parameterization Done Successfully");
	}

	@Test
	public void TestWelcomecontent() {
		String Welcome = dr.findElement(By.id("WelcomeContent")).getText();
		Assert.assertTrue(Welcome.contains("ABC"));
		System.out.println("WelcomeContent verified");
	}

	@AfterMethod
	public void Logout() {
		dr.findElement(By.linkText("Sign Out")).click();
		System.out.println("Logout Successfully");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close app Successfully");
		dr.close();
	}
}
