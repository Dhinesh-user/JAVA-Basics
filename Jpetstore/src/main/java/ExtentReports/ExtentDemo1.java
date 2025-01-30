package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo1 {

	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public void startTest() {
		report = new ExtentReports(System.getProperty("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore")+"ER.HTML");
		test = report.startTest("ExtentDemo1");
	}
	
	@Test
	public void extendreportsDemo() {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions Options = new ChromeOptions();
	    Options.addArguments("start-Maximized");
	    WebDriver Driver = new ChromeDriver(Options);
	    Driver.get("https://petstore.octoperf.com/");	
	    String title = Driver.getTitle();	
	    
	    if(title.contains("Mywipro")) {
	    	System.out.println("Available");
	    	test.log(LogStatus.PASS, "Navigated to the specfied URL");
	    }
	    else {
	    	System.out.println("Not Available");
	    	test.log(LogStatus.FAIL, "Not Navigated to the specfied URL");
	    }
	}
	
	@AfterClass
	public void EndTest() {
		report.endTest(test);
		report.flush();
	}

}
