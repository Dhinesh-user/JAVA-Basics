package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	
	public void ExplicitWaitURLToBe(String url, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.urlToBe(url));
	}
	
	public WebDriver Launch() {
		WebDriverManager.edgedriver().setup();
		this.driver= new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
