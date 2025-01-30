package com.wipro.Jpetstore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwaitexample {

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
		
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	
		WebElement crossbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")));
		crossbutton.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\\\"listingFilterCheckbox\\\"]")).click();
		
		
	}

}
