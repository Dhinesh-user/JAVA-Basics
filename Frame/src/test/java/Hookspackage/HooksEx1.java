package Hookspackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksEx1 {
	
	@Before(order=0)
	public void beforebefore() {
		System.out.println(" Before before Hook");
	}
	
	@Before(order=1)
	public void before() {
		System.out.println("before Hook");
	}
	
	@After(order=1)
	public void after() {
		System.out.println("after Hook");
	}
	
	@After(order=0)
	public void afterafter() {
		System.out.println("After after Hook");
	}
	
}
