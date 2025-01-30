package com.wipro.Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
//	    
	    Driver.get("https://demo.automationtesting.in/Frames.html");
//	Single Frame
	    WebElement frame = Driver.findElement(By.id("singleframe"));
//	    Driver.switchTo().frame(frame);
	    Driver.switchTo().frame(1);
	    Driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Learning Frames");
	
//  Multiple Frame
//	    Driver.switchTo().frame(0);
	    Driver.switchTo().defaultContent();
	    Driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']")).click();
		WebElement frame1= Driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		Driver.switchTo().frame(frame1);
		WebElement frame2= Driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		Driver.switchTo().frame(frame2);
		Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("I'm on frames");
		Driver.switchTo().defaultContent();
		
	
	}

}
