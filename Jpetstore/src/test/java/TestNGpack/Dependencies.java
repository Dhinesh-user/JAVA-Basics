package TestNGpack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Dependencies {
	@Test(priority=1)
	public void add() {
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, 35);
		System.out.println("Testcase passed");
	}

//	Even the add gets failed stngcmp going to be executed bcz of alwaysRun attribute
	
	@Test(dependsOnMethods ="add")
	public void stngCmp() {
		String cmp="Wipro Technologies Limited";
		SoftAssert SA=new SoftAssert();
		SA.assertTrue(cmp.contains("Limited"));
		SA.assertAll();
		System.out.println("string comparision successfull");
	}
	@Test(dependsOnMethods="stngCmp",alwaysRun=true)
	public void multi() {
		int x=20;
		int y=30;
		Assert.assertEquals(x*y, 600);
		System.out.println("test case passed");
		
	}
}
