package com.wipro.Jpetstore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitMethods {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    Driver.get("https://www.makemytrip.com/");
	    Thread.sleep(15000);
	    System.out.println("Print");
//	    Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")).click();
	
		WebDriverWait wait =new WebDriverWait(Driver,Duration.ofSeconds(15));
        WebElement crossbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")));
        crossbutton.click();
        Driver.findElement(By.xpath("//*[@id=\"listingFilterCheckbox\"]")).click();
 
		Thread.sleep(20000);
		Driver.close();
        
	    
	    
	}

}
