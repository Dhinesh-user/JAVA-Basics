package Testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExecutionDetails.ExecutionDetails;
import PageObjects.HomePageHRM;
import PageObjects.LoginPageHRM;
import PageObjects.LogoutPageHRM;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import Utilities.ExcelData;

public class OrangeHRM {
	static WebDriver dr;
	static ExtentTest test;
	static ExtentReports report;
	static ExecutionDetails br;
	String username;
	int links;
	HomePageHRM hp;
	LoginPageHRM LI;
	WebDriverWait we;

	@DataProvider(name = "creds")
	public Object[][] TestData() throws IOException {
		ExcelData ED = new ExcelData();
		Object[][] data = ED.getExcelData("C:\\Users\\PD20313015\\Downloads\\Book1.xlsx", "Sheet1");
		return data;
	}

	@BeforeSuite
	public void beforeSuite() {
		report = new ExtentReports(System.getProperty("user.dir") + "//ER.HTML");
	}

	@BeforeClass
	public static void startTest() throws IOException {
		
		br = new ExecutionDetails();
		dr = br.browserinit();
		
	}

	@Test(dataProvider = "creds", priority = 1)
	public void Login(String UN, String pwd) throws IOException, Exception {
		test = report.startTest("Verify username is displayed");
		LI = new LoginPageHRM(dr);
		test.log(LogStatus.INFO, "Launched the Browser successfully");
        test.log(LogStatus.INFO, "Navigated to OrangeHrm website");
		LI.EnterUsername(UN);
		test.log(LogStatus.INFO, "Entered the username");
		LI.EnterPassword(pwd);
		test.log(LogStatus.INFO, "Entered the password");
		LI.LoginButton();
		test.log(LogStatus.INFO, "Login Successfully");
//		Thread.sleep(2000);
//		we = new WebDriverWait(dr, Duration.ofSeconds(20));
		hp = new HomePageHRM(dr);
//		we = new WebDriverWait(dr, Duration.ofSeconds(20));
		System.out.println("Getting Username");
		test.log(LogStatus.INFO, "Getting Username");
		Thread.sleep(2000);
		username = hp.getLoggedInUser();
		System.out.println("Username: " + username);
		if (username.contains("Briyan")) {
			System.out.println("Briyan is Displayed");
			test.log(LogStatus.PASS, "Briyan is Displayed");
		} 
		else {
			System.out.println("Briyan is not Displayed");
			test.log(LogStatus.FAIL, test.addScreenCapture(br.takeScreenshot(dr)) + "Briyan is not Displayed");
		}

	}

	@Test(priority = 2)
	public void Testcase2() throws IOException {
		test = report.startTest("Verify No.of links displayed");
		hp = new HomePageHRM(dr);
		links = hp.NoOfLinksPresent();
		System.out.println("No. of links: " + links);
		test.log(LogStatus.INFO, "No.of links displayed is: " + links);
		if (links == 20) {
			System.out.println("No.of links displayed is 20");
			test.log(LogStatus.PASS, "No.of links displayed is 20");
		} 
		else {
			System.out.println("No.of links displayed is not 20");
			test.log(LogStatus.FAIL, test.addScreenCapture(br.takeScreenshot(dr)) + "No.of links displayed is not 20");
		}
	}

	@AfterMethod
	public void afterMethod() {
		report.endTest(test);
	}

	@AfterClass
	public void EndTest() throws Exception {

		LogoutPageHRM LO = new LogoutPageHRM(dr);
		LO.Logout();
	}

	@AfterSuite
	public void afterSuite() {
		report.flush();
	}
}
