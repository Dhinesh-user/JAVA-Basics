package com.wipro.Jpetstore;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    
	    Driver.get("https://demo.automationtesting.in/Alerts.html");
	    
	    Driver.findElement(By.id("OKTab")).click();
	    
	    Alert ar = Driver.switchTo().alert();
	    System.out.println(ar.getText());
	    ar.accept();
	    
	    Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    Driver.findElement(By.id("CancelTab")).click();
	    System.out.println(ar.getText());
	    ar.dismiss();
	    
	    Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	    Driver.findElement(By.id("Textbox")).click();
	    System.out.println(ar.getText());
	    ar.sendKeys("Dhonii");
	    Thread.sleep(2000);
	    ar.accept();
	    
	 
	  
	}

}
