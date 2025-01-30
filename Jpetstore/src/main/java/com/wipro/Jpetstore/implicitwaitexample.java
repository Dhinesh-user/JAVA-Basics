package com.wipro.Jpetstore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitwaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("start-Maximized");  
//		WebDriver driver = new ChromeDriver(opt);
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//launched the browser
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"listingFilterCheckbox\"]")).click();
		
	
		
	}

}
