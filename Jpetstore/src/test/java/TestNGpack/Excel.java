package TestNGpack;



import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    Driver.get("https://petstore.octoperf.com/");
	    Driver.findElement(By.linkText("Enter the Store")).click();
	    Driver.findElement(By.linkText("Sign In")).click();
	    
	    FileInputStream file = new FileInputStream("C:\\Users\\PD20313015\\Downloads\\Mydata.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(file);
	    XSSFSheet sheet = wb.getSheetAt(0);
	    Row R1 = sheet.getRow(2);
	    Cell c11 = R1.getCell(0);
	    Cell c12 = R1.getCell(1);
	    String UN = c11.getStringCellValue();
	    String Pwd = c12.getStringCellValue();
	    System.out.println(UN);
	    System.out.println(Pwd);
	    
	    
	    
	    
	    Driver.findElement(By.xpath("//input[@name='username']")).click();
	    Driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
	    Driver.findElement(By.xpath("//input[@name='password']")).clear();
	    Driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
	}

}
