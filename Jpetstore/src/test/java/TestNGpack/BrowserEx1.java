package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserEx1 {
	WebDriver driver;
	public WebDriver browserinit() throws IOException
	{
		FileInputStream fl = new FileInputStream("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore\\config.properties");
		Properties p1 = new Properties();
		p1.load(fl);
		String browser = p1.getProperty("browserName");
		String url = p1.getProperty("URL");
		
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		return driver;
	}
}

