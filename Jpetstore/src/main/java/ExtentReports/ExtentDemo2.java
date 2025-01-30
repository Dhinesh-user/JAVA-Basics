package ExtentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo2 {
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public void startTest() {
		report = new ExtentReports(System.getProperty("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore")+"ER2.HTML");
		test = report.startTest("ExtentDemo2");
	}
	
	@Test
	public void extendreportsDemo() throws IOException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    Driver.get("https://petstore.octoperf.com/");	
	    String title = Driver.getTitle();	
//	    Assert.assertTrue(title.contains("Mywipro"));
	    if(title.contains("Mywipro")) {
	    	System.out.println("Available");
	    	test.log(LogStatus.PASS, "Navigated to the specfied URL");
	    	
	    }
	    else {
	    	System.out.println("Not Available");
	    	test.log(LogStatus.FAIL, test.addBase64ScreenShot(capture(Driver))+"Not Navigated to the specfied URL");
	    }
	}
	
	

	@AfterClass
	public void EndTest() {
		report.endTest(test);
		report.flush();
	}

	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}	
}



