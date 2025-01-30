package WebDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    ChromeOptions Options = new ChromeOptions();
    Options.addArguments("start-Maximized");
    WebDriver Driver = new ChromeDriver(Options);
    
//  Get Methods in Selenium
    Driver.get("https://petstore.octoperf.com/");
    System.out.println(Driver.getTitle());
    System.out.println(Driver.getWindowHandle());
    System.out.println(Driver.getPageSource());
    System.out.println(Driver.getCurrentUrl());
    
//    Navigation Methods in Selenium
    
    
//		WebDriverManager.edgedriver().setup();
//		WebDriver Dr = new EdgeDriver();
//		Dr.manage().window().maximize();
//		Dr.get("https://petstore.octoperf.com/");
		
	    
;	}

}
