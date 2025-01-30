package TestCases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import utilities.*;
import Base.*;
import Pages.HomePage;
import Pages.LoginPage;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Testcase {
 
  static public WebDriver driver;
  static Properties p;
  static ExtentReports report;
  static ExtentTest test;
  LoginPage lp;
  HomePage home;
  utilities util;
  Base base;
  
  @Test(dataProvider = "dp",priority=0)
  public void loginFunctionality(String user, String pwd) throws IOException {
	  test = report.startTest("Verify the username Briyan is displayed");
	  util = new utilities();
	  base = new Base();
	  test.log(LogStatus.INFO, "Launched the Browser successfully");
	  test.log(LogStatus.INFO, "Navigated to OrangeHrm website");
	  lp = new LoginPage(driver);  
	  test.log(LogStatus.INFO, "Logging in with user: "+user+" password: "+pwd);
	  lp.EnterUsername(user);
	  test.log(LogStatus.INFO, "Entered the username");
	  lp.EnterPassword(pwd);
	  test.log(LogStatus.INFO, "Entered the password");
	  lp.LoginButton();	  
	  System.out.println(driver.getCurrentUrl());
	  base = new Base();
	  base.ExplicitWaitURLToBe(p.getProperty("URLAfterLogin"), driver);
	  test.log(LogStatus.INFO, "Logged in successfully");
	  home = new HomePage(driver);
	  
	  if(home.getLoggedInUser().contains(p.getProperty("User"))) {
		  test.log(LogStatus.INFO, "User Briyan has logged in successfully");
		  test.log(LogStatus.PASS, "Verified the username Briyan is displayed");
	  }
	  else {
		  test.log(LogStatus.FAIL, "Unknown user has been logged in");
		  test.log(LogStatus.FAIL, "Logged user: "+home.getLoggedInUser());
		  test.log(LogStatus.FAIL, test.addScreenCapture(util.takeScreenshot(driver))+"The username Briyan is not displayed");
	  }
	  Assert.assertTrue(home.getLoggedInUser().contains(p.getProperty("User")));
  }
  
  @Test(priority=1)
  public void totalNoOfLinks() throws IOException {
	  test = report.startTest("Verify the number of links present");
	  home = new HomePage(driver);
	  util = new utilities();
	  int link=home.NoOfLinksPresent();
	  test.log(LogStatus.INFO, "Fetching total no.of links in the home page");
	  test.log(LogStatus.INFO, "Total no.of links in the home page: "+link);
	  test.log(LogStatus.INFO, "Verifing the total no.of links in the homepage");
	  if(link==20) {  
		  test.log(LogStatus.PASS, "The total no.of links in the homepage is as expected");
	  }
	  else {
		  test.log(LogStatus.FAIL, "Expected total no.of links in the homepage is 20 but actual "+link);
		  test.log(LogStatus.FAIL, test.addScreenCapture(util.takeScreenshot(driver))+"The no.of links are not as expected");
	  }
	  Assert.assertEquals(link, 20);
  }
  
  @AfterMethod
  public void afterMethod() {
	  report.endTest(test);
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  util = new utilities();
	  Object[][] data = util.ExcelReadMethod("C:\\Users\\KA20245650\\Downloads\\ExcelReadFile.xlsx");
	return data;
    
  }
  @BeforeClass
  public void beforeClass() throws IOException {
	  base = new Base();
	  Testcase.driver=base.Launch();
	  String Filepath= "C:\\Users\\KA20245650\\eclipse-workspace\\Mar13_Framework\\src\\main\\java\\utilities\\config.properties";
	  FileInputStream fin = new FileInputStream(Filepath);
	  p = new Properties();
	  p.load(fin);
	  driver.get(p.getProperty("URL"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  report = new ExtentReports(System.getProperty("user.dir")+"//Extent.html");
  }
  
  @AfterSuite
  public void afterSuite() {
	  report.flush();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
