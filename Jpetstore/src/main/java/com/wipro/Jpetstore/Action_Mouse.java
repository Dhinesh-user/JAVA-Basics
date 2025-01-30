package com.wipro.Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Mouse {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    
	    Driver.get("https://jqueryui.com/droppable/");
	    String handle = Driver.getWindowHandle();
	    WebElement fram = Driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    Driver.switchTo().frame(fram);
	    WebElement drag = Driver.findElement(By.id("draggable"));
	    WebElement drop = Driver.findElement(By.id("droppable"));
	    
	    Actions act = new Actions(Driver);
//	    act.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	    act.dragAndDrop(drag, drop).build().perform();
	    
	    Driver.switchTo().window(handle);
	    WebElement hover = Driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[2]/li[2]/a"));
	    act.moveToElement(hover).build().perform();
//	    act.moveToElement(hover, -10, 0).click().perform();
//	    act.moveToElement(hover).moveByOffset(-10, 0).click().perform();
	    
	    
	}

}
