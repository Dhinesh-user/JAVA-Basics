package PageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PFwithoutFindBy {

	public static WebElement username;
	public static WebElement password;
	public static WebElement signon;
	
	@Test
	public void Login() {
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		
		
		
		PageFactory.initElements(dr, PFwithoutFindBy.class);
		username.sendKeys("j2ee");
		password.clear();
		password.sendKeys("j2ee");
		signon.click();
	}
}
