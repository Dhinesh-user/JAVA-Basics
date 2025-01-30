package com.wipro.Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Web_Table {

	public static void main(String[] args) {
		   WebDriverManager.edgedriver().setup();
//	        Maximized window opens first	
	  	
//			first opens window then maximized
		    WebDriver Driver = new EdgeDriver();
		    Driver.manage().window().maximize();
		    
		    Driver.get("https://demo.opencart.com/admin/index.php");
		    Driver.findElement(By.cssSelector("button.btn btn-primary")).click();
	}

}
