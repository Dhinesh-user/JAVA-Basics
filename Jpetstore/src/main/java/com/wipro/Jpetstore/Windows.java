package com.wipro.Jpetstore;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    
	    Driver.get("https://demo.automationtesting.in/Windows.html");
	    
	    Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	    Driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
	    
	    System.out.println(Driver.getWindowHandle()); //return ID of current window
	    System.out.println(Driver.getWindowHandles()); // return List of ID's of all the windows opened
	    
	    Set<String> win = Driver.getWindowHandles();
	    Iterator<String> itr = win.iterator();
	    String win1=null;
	    String win2=null;
	    String win3=null;
	    
	    while(itr.hasNext()){
	    	win1=itr.next();
	    	win2=itr.next();
	    	win3=itr.next();
	    }
	    
	    Driver.switchTo().window(win2);
	    System.out.println("Child1 Window Title: "+Driver.getTitle());
	 
	    Driver.switchTo().window(win3);
	    System.out.println("Child2 Window Title: "+Driver.getTitle());
	    
	    Driver.switchTo().window(win1);
	    System.out.println("Parent Window Title: "+Driver.getTitle());
//	    Driver.quit();  //Closes all the open tabs in the browser
//	    Driver.close();  //close current tab in the browser
	}
//	Using for each loop
//	   Set<String> win = Driver.getWindowHandles();
//	   for(String allwin :win) {
//		System.out.println(allwin);
//	}







}
