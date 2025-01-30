package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example2 {
static WebDriver dr;
	
    public static void main(String[] args) throws IOException{
    	
    	FileInputStream fl = new FileInputStream("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore\\config2.properties");
		Properties p1 = new Properties();
		p1.load(fl);
		String browser = p1.getProperty("browserName");
		String url = p1.getProperty("URL");
		String UN = p1.getProperty("UserName");
		String Pwd =p1.getProperty("PassWord");
		
		BrowserEx2 br = new BrowserEx2();
		dr=br.browserinit(browser);
		
		dr.get(url);
		dr.findElement(By.linkText("Enter the Store")).click();
		dr.findElement(By.linkText("Sign In")).click();
		dr.findElement(By.xpath("//input[@name='username']")).click();
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		dr.findElement(By.xpath("//input[@name='password']")).clear();
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
		dr.findElement(By.xpath("//input[@name='signon']")).click();
	    dr.findElement(By.linkText("Sign Out")).click();
		
}
    }