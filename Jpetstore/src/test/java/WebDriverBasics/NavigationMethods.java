package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		//launched the browser
		driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/");
        System.out.println(driver.getTitle());
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
       System.out.println(driver.getTitle());
       //back top ipetstore
       driver.navigate().back();
       System.out.println(driver.getTitle());
       //forward to orangeHRM
       driver.navigate().forward();
       System.out.println(driver.getTitle());
       
       //Refresh the page
       driver.navigate().refresh();
       
       
	}

}
