package TestNGpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(IInvokeListeners.class)
public class IInvokelistenersExample {
	@Test(priority=1)
	public void firstTest()
	{
		System.out.println("My First Test");
	}
	
	@Test(priority=2)
	public void secondTest()
	{
		System.out.println("My Second Test");
	}
	
	 @BeforeClass
	    public void bclass() {
	        System.out.println("Before Class Method Started");
	    }
	 
	    @AfterClass
	    public void aclass() {
	        System.out.println("After Class Method Started");
	    }
}
