package com.wipro.Jpetstore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicHTMLForm {

	public static void main(String[] args) {
		boolean chk1,rb1;
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    
	    Driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
	    Driver.findElement(By.xpath("//input[@name='username']")).click();
	    Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sunil");
	    Driver.findElement(By.xpath("//input[@name='password']")).click();
	    Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wipro@123");
	    Driver.findElement(By.xpath("//textarea[@name='comments']")).click();
	    Driver.findElement(By.xpath("//textarea[@name='comments']")).clear();
	    Driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("I am learning Selenium");
	    Driver.findElement(By.name("filename")).sendKeys("C:\\Users\\PD20313015\\Downloads\\WelcomeHTML.txt");

	    JavascriptExecutor js = (JavascriptExecutor)Driver;
	    js.executeScript("scroll(0, 350);");
	    
	    WebElement checkbox1 = Driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	    chk1 = checkbox1.isSelected();
	    if(chk1==false) {
	    Driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	    checkbox1.click();
	    }
	    
	    WebElement RadioButton1 =Driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	    rb1 =RadioButton1.isSelected();
	    if(rb1==false) 
	    	RadioButton1.click();
	    
	    Select Multi = new Select(Driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select")));
	    Multi.deselectAll();
	    Multi.selectByVisibleText("Selection Item 1");
	    Multi.selectByIndex(2);
	
	    Select dropdown = new Select(Driver.findElement(By.name("dropdown")));
//	    dropdown.selectByVisibleText("");
	    dropdown.selectByIndex(4);
	    
//	    To get all the options displayed in the dropdown use getOptions()
	    List<WebElement> opt =dropdown.getOptions();
	    for(WebElement El:opt)
	    System.out.println(El);
//	    To get no of options displayed
	    int size = opt.size();
	    System.out.println(size);
	    Driver.findElement(By.xpath("//input[@value='submit']")).click();
	    

	    
	     String name = Driver.findElement(By.id("_valueusername")).getText();
	     if(name.equals("Sunil")) {
	    	 System.out.println("Matched");
	     }
	     else {
	    	 System.out.println("Not Matched");
	     }
	     
	    Driver.findElement(By.linkText("Go back to the form")).click();
//	    	    Driver.close();
	    
	}

	
}
