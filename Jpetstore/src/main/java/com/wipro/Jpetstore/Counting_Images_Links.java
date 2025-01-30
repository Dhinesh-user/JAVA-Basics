package com.wipro.Jpetstore;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Counting_Images_Links {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    
	    Driver.get("https://mycontactform.com/samples.php");
	    
	    int textbox = Driver.findElements(By.xpath("//*[@type='text' or @type='password']")).size();
	    System.out.println("No. of textbox; "+textbox);
	    
	    int checkbox = Driver.findElements(By.xpath("//*[@type='checkbox']")).size();
	    System.out.println("No. of checkbox; "+checkbox);
	    
	    int radiobtn = Driver.findElements(By.xpath("//*[@type='radio']")).size();
	    System.out.println("No. of radiobtn; "+radiobtn);
	    
	    int links = Driver.findElements(By.tagName("a")).size();
	    System.out.println("No. of links; "+links);
	  
	    int Images = Driver.findElements(By.tagName("img")).size();
	    System.out.println("No. of Images; "+Images);
	    
	    
//	    TakesScreenshot scrShot =((TakesScreenshot)Driver); //Convert web driver object to TakeScreenshot
//	    
//	    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); //Call getScreenshotAs method to create image file
//	    
//	    File DestFile=new File("C:\\Users\\PD20313015\\Downloads\\Screenshot.png"); //Move image file to new destination
//	    
//	    FileUtils.copyFile(SrcFile, DestFile); //Copy file at destination
	    
	    
	   int id=Driver.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul/li/a")).size();
	   System.out.println(id);
	    int count = 1;
	    while(count<=id) {
	    	Driver.findElement(By.xpath("(//*[@id=\"left_col_top\"]/ul/li/a)["+count+"]")).click();
	    	String Title = Driver.findElement(By.xpath("//*[@id=\"center_col\"]/h4")).getText();
	        System.out.println(Title);
	    File f1=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f1,new File("C:\\Users\\PD20313015\\Documents\\CountLink\\"+Title+".png"));
	    count++;
	    }
	    
//	    int OL= Driver.findElements(By.xpath("//*[@id='left_col_top']/ul")).size();
//	    for(int p=1;p<=OL;p++) {
//	    	int IL =Driver.findElements(By.xpath("//*[@id='left_col_top']/ul["+p+"]/li")).size();
//	    	for(int q=1;q<=IL;q++) {
//	    		Driver.findElement(By.xpath("//*[@id='left_col_top']/ul["+p+"]/li["+q+"]/a")).click();
//	    		String Heading = Driver.findElement(By.xpath("//*[@id='center_col']/h4")).getText();
//	    		System.out.println(Heading);
//	    		File f2=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
//	    	    FileUtils.copyFile(f1,new File("C:\\Users\\PD20313015\\Documents\\CountLink\\"+Heading+".png"));
//	    	    
//	    	}
//	    }
	    		
	    }
	}


