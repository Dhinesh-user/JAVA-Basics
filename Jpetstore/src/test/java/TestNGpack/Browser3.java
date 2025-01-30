package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser3 {
	WebDriver driver;
	String UserName;
	String Password;
	public WebDriver browserinit() throws IOException
	{
		FileInputStream fl = new FileInputStream("E:\\SeleniumPrograms\\SeleniumWebDriver-New\\MySampleProj\\config3.properties");
		Properties pr = new Properties();
		pr.load(fl);
		String Browse=pr.getProperty("browser_name");
		String Urlname=pr.getProperty("URL");
		String UN=pr.getProperty("username");
		String pwd=pr.getProperty("password");
		
		this.UserName=UN;
		this.Password=pwd;
		
		
		switch(Browse)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Urlname);
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(Urlname);
		}
		return driver;
	}
	}