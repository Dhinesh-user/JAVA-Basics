package com.wipro.Jpetstore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    
	    Driver.get("https://demo.automationtesting.in/Selectable.html");
	    List<WebElement> selectable = Driver.findElements(By.xpath("//*[@id='Default']/ul/li"));
	    System.out.println(selectable.size());
	    Actions act = new Actions(Driver);
//	    act.keyDown(Keys.CONTROL)
//	    .click(selectable.get(0))
//	    .click(selectable.get(1))
//	    .click(selectable.get(2)).build().perform();
	    
	    act.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).build().perform();
	}

}
