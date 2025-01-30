package TestNGpack;
import org.testng.annotations.Test;



public class FirstTestNG {
   
	@Test(priority=1)
	public void Login() {
		System.out.println("Login");
	}
	@Test(priority=2)
	public void Logout() {
		System.out.println("Logout");
		
	}
	@Test(priority=3)
	public void Home() {
		System.out.println("Homepage");
	}
	@Test
	public void back() {
		System.out.println("BackPage");
	}
	public static void main(String[] args) {
		System.out.println("Dinesh");
		}
}
