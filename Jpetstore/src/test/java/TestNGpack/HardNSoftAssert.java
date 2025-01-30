package TestNGpack;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardNSoftAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10;
		int b=20;
		
		Assert.assertEquals(30, a+b);
		System.out.println("Completed");
		
//		Assert.assertEquals(35, a+b);
//		System.out.println("Missed");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(35, a+b);
//		sa.assertAll();  // further steps wont be executed only throw the exception
		System.out.println("Impressed");
//		sa.assertAll();  // Handles Exception -- helps to continue with next steps
		
		
		
	}

}
