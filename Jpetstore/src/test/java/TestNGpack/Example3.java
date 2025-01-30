package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example3 {
static WebDriver dr;
	
    public static void main(String[] args) throws IOException{
    	
    	Browser3 br= new Browser3();
		dr=br.browserinit();
		String user=br.UserName;
		String pass=br.Password;
	
		dr.findElement(By.linkText("Enter the Store")).click();
		dr.findElement(By.linkText("Sign In")).click();
		dr.findElement(By.name("username")).sendKeys(user);
		dr.findElement(By.name("password")).clear();
		dr.findElement(By.name("password")).sendKeys(pass);
    }
    }
