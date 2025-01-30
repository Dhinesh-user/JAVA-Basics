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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx {

	WebDriver dr;

	@DataProvider(name = "creds")
	public Object[][] TestData() {
		Object[][] data = new Object[][] { { "sunil", "Vish" }, { "Asha", "Vish" } };
		return data;
	}

	@BeforeMethod()
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-Maximized");
		dr = new ChromeDriver(Options);
		dr.get("https://petstore.octoperf.com/");

	}

	@Test(dataProvider = "creds",priority=1)

	public void Login(String UN, String Pwd) {
		dr.findElement(By.linkText("Enter the Store")).click();
		dr.findElement(By.linkText("Sign In")).click();

		dr.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		dr.findElement(By.xpath("//input[@name='password']")).clear();
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);

	}

	@AfterMethod
	public void EndApp() {
//		dr.quit();

	}
}
