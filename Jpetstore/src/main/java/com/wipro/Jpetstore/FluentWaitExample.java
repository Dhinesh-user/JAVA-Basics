package com.wipro.Jpetstore;

import java.time.Duration;
//import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExample {
	public static void main(String[] args) {
	WebDriver driver;
	
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
// Launched the browser
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			
			
			driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")).click();
// Fluent wait	
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					  .withTimeout(Duration.ofSeconds(20))
					  .pollingEvery(Duration.ofMillis(2))
					  .ignoring(NoSuchElementException.class);
			
			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			});

			foo.click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();
			driver.findElement(By.xpath("//*[@id=\\\"listingFilterCheckbox\\\"]")).click();
			
//	NoSuchElementException import should be in selenium not in java util
		}

}
