package com.wipro.Jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quitclose {

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
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		//driver.close();//close the current window handle
		driver.quit();//closes all the window, multiple windows can be closed at a time
		
	}

}
