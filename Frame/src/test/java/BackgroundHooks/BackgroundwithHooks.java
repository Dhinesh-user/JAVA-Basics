package BackgroundHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundwithHooks {

	@Before
	public void before() {
		System.out.println("before Hook");
	}
	
	@After
	public void after() {
		System.out.println("after Hook");
	}
}
