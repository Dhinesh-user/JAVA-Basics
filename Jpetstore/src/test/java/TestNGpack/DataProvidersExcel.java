package TestNGpack;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersExcel {
WebDriver dr;
	
	@DataProvider(name="Creds")
	public Object[][] Testdata() throws IOException
	{
		ExcelEx2 ERE=new ExcelEx2();
		Object[][] data = ERE.getExcelData("C:\\Users\\PD20313015\\Downloads\\Mydata.xlsx", "Sheet1");
		return data;
	}
	
	
	@BeforeMethod
	public void Launch()
	{
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://petstore.octoperf.com/ ");
	}
	
  @Test(dataProvider = "Creds")
   public void Log(String un, String pwd) {
	  dr.findElement(By.linkText("Enter the Store")).click();
	  dr.findElement(By.linkText("Sign In")).click();
	  dr.findElement(By.name("username")).sendKeys(un);
	  dr.findElement(By.name("password")).clear();;
	  dr.findElement(By.name("password")).sendKeys(pwd);
	  
}
  @AfterMethod
	public void EndApp()
	{
//	  dr.quit();
	}
	
}
