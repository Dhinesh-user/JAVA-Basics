package com.wipro.Jpetstore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
//   Maximized window opens first	
//	    ChromeOptions Options = new ChromeOptions();	    
//  	Options.addArguments("start-Maximized");
//		WebDriver Driver = new ChromeDriver(Options);
		
//		first opens window then maximized
	    WebDriver Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	    
	    Driver.get("https://demo.automationtesting.in/AutoComplete.html");
	    Driver.findElement(By.xpath("//*[@id=\"searchbox\"]")).sendKeys("se");
	    Thread.sleep(2000);
	    List<WebElement> optionslist = Driver.findElements(By.xpath("//*[@id='menucontainer']/ul/li"));
	    System.out.println(optionslist.size());
	    for(WebElement opt : optionslist) {
	    	if(opt.getText().equals("Jersey")) {
	    		opt.click();
	    		break;
	    	}
	    }
	}

}
