package TestNGpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ISuitechild1 {
	@BeforeSuite
	public void bsuite()
	{
	   System.out.println("BeforeSuite method started");	
	}
	
	
	@Test
	public void test()
	{
		System.out.println("Test Method started");
	}
	
	@AfterSuite
	public void asuite()
	{
	   System.out.println("AfterSuite method started");	
	}
}
