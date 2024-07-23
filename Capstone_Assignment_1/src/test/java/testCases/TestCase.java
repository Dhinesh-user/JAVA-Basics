package testCases;

import org.testng.annotations.Test;
import java.io.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.Base;
import pages.CheckoutPage;
import pages.CreateAccount;
import pages.HomePage;
import pages.MyAccountPage;
import pages.MyOrderPage;
import pages.ShoppingCartPage;
import pages.SignInPage;
import pages.TeesPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase extends Base {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	Base base;
	HomePage hp;
	CreateAccount ca;
	SignInPage signin;
	MyAccountPage acc;
	TeesPage tees;
	ShoppingCartPage shopping;
	CheckoutPage checkout;
	MyOrderPage order;

	@Test(dataProvider = "dp")
	public void f(String fname, String lname, String email, String pwd, String cpwd, String add, String city,
			String state, String pin, String country, String ph) throws IOException, InterruptedException {
		test = report.startTest(
				"Testcase to test the functionality of signIn, adding products to the cart, checkout and signOut modules of https://magento.softwaretestingboard.com/");
		test.log(LogStatus.INFO, "Testcase to create an account for new user");

		hp = new HomePage(driver);
		
		/*
		//Creating a new account for unregistered user
		 
		  hp.clickOnCreateAccount();
		  ca = new CreateAccount(driver); ca.enterFirstname(fname);
		  test.log(LogStatus.INFO, "Entered firstname --> " + fname);
		  ca.enterLastname(lname); 
		  test.log(LogStatus.INFO, "Entered lastname --> " +lname); ca.enterEmailId(email); 
		  test.log(LogStatus.INFO, "Entered emailID --> " + email); ca.enterPassword(pwd);
		  test.log(LogStatus.INFO, "Entered password --> " + pwd);
		  ca.enterConfirmedPassword(cpwd); 
		  test.log(LogStatus.INFO, "Entered confirmed password --> " + cpwd); 
		  ca.clickCreateAccount();
		*/

		// TO be commented
		// SignIn functionality for already registered user
		hp.clickOnSignIn();
		signin = new SignInPage(driver);
		signin.enterEmailId(email);
		signin.enterPassword(pwd);
		signin.clickOnSignIn();
		//

		test.log(LogStatus.INFO, "Signed in Succesfully " + test.addScreenCapture(captureScreenshot(driver)));
		hp.clickSale();
		test.log(LogStatus.INFO, "Clicked on Sale");
		hp.clickOnTees();
		test.log(LogStatus.INFO, "Clicked on Tees under Women");

		// Filtering the tees with respect to Climate, Material, Pattern
		tees = new TeesPage(driver);
		tees.clickClimate();
		test.log(LogStatus.INFO, "Filtered the Tees by Climate");
		tees.clickMaterial();
		test.log(LogStatus.INFO, "Filtered the Tees by Material");
		tees.clickPattern();
		test.log(LogStatus.INFO, "Filtered the Tees by Pattern");

		// Clicking on the first product
		hp.clickOnFirstProduct();
		test.log(LogStatus.INFO, "Clicked on First Product shown after filtering the tees");

		// Adding to the cart by selecting appropriate size, color
		tees.chooseCommoditiesAndAddToCart();
		test.log(LogStatus.INFO, "Selected appropriate size and colour, and added to the cart");
		hp.showCart();
		test.log(LogStatus.INFO, "Under more choices, clicked on addition product");

		// Adding the additional product and validating the review
		shopping = new ShoppingCartPage(driver);
		String review = shopping.reviewCheck();
		test.log(LogStatus.INFO, "Product Review: " + review);
		Assert.assertNotNull(review);
		shopping.addToCart();
		test.log(LogStatus.INFO, "Adding the additional product to the cart");
		hp.showCart();

		// Clicked on proceed to checkout
		shopping.proceedToCheckout();
		test.log(LogStatus.INFO, "Clicked on proceed to checkout");

		// Checking out the product
		checkout = new CheckoutPage(driver);
		String discountError = checkout.enterMandatoryFields(add, city, state, pin, country, ph);
		test.log(LogStatus.INFO, "Added mandatory fields in the checkout page");
		Assert.assertNotNull(discountError);
		checkout.orderPlacement();
		String orderId = checkout.returnOrderId();
		String orderPlacement = "Order Placed!!! OrderID: " + orderId;
		test.log(LogStatus.INFO, orderPlacement);
		test.log(LogStatus.INFO, test.addScreenCapture(captureScreenshot(driver)));
		fileWriter(System.getProperty("user.dir") + "\\TextFolder\\OrderPlacement.txt", orderPlacement);
		test.log(LogStatus.INFO, "Written the orderID details in text file");

		// Validating the order
		hp.clickOnMyAccount();
		test.log(LogStatus.INFO, "Clicked on my Account");
		acc = new MyAccountPage(driver);
		acc.clickMyOrder();
		test.log(LogStatus.INFO, "Clicked on my Order");
		order = new MyOrderPage(driver);
		String actualOrderID = order.toViewOrderFromOrderTable(orderId);
		Assert.assertTrue(actualOrderID.contains(orderId));
		test.log(LogStatus.INFO, "Validated the ordered details by clicking on View Order");

		// SignOut functionality
		String signOutMsg = hp.clickOnSignOut();
		Assert.assertEquals(signOutMsg, "You are signed out");
		test.log(LogStatus.INFO, "Signed out Succesfully " + test.addScreenCapture(captureScreenshot(driver)));
	}

	@AfterMethod
	public void afterMethod() {
		report.endTest(test);
	}

	@DataProvider
	public Object[][] dp() throws IOException {
		Object[][] data = readFromExcel(
				System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\TestData_Capstone1.xlsx");
		return data;
	}

	@BeforeClass
	public void beforeClass() throws IOException {
		this.driver = launchBrowser();
		FileInputStream fin = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
		Properties p = new Properties();
		p.load(fin);
		getUrl(p.getProperty("url"));
		windowMaximize();
		implicitWait(driver);
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeSuite
	public void beforeSuite() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\extent.html");
	}

	@AfterSuite
	public void afterSuite() {
		report.flush();
	}

}
