package com.wipro.Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginExample {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    Driver.get("https://petstore.octoperf.com/");
	    Driver.findElement(By.linkText("Enter the Store")).click();
	    Driver.findElement(By.linkText("Sign In")).click();
	    Driver.findElement(By.xpath("//input[@name='username']")).click();
	    Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("j2ee");
//	    JavascriptExecutor j = (JavascriptExecutor) Driver;
//	      j.executeScript("document.getElementsByName('q')[0].value= 'tutorialspoint'","");
	      
	    Driver.findElement(By.xpath("//input[@name='password']")).clear();
	    Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("j2ee");
	    Driver.findElement(By.xpath("//input[@name='signon']")).click();
	    Thread.sleep(3000);
	    Driver.findElement(By.linkText("Sign Out")).click();
//	    if we wanna click enter button after entering the data into textbox
//	    Driver.findElement(By.name("q")).sendKeys("Kick"+Keys.ENTER);
	    
//	    Using getattribute we can get the text for the attribute {value = TestLeaf} will return Testleaf
//	    Driver.findElement(By.name("username")).getAttribute("value");
	    
//	    To know the position(x,y) of the element use getlocation method with point class
//	    Point p1= Driver.findElement(By.name("")).getLocation();
//	    int x= p1.getX();
//	    int y= p1.getY();
	}

}
