package TestNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTestNG {
	@Test(priority=1)
	public void Login() {
		System.out.println("Login");
	}
	@BeforeMethod
	public void Logout() {
		System.out.println("Logout");
		
	}
	@AfterMethod
	public void Home() {
		System.out.println("Homepage");
	}
	
	@Test(priority=2)
	public void Create() {
		System.out.println("Create");
	}
}
