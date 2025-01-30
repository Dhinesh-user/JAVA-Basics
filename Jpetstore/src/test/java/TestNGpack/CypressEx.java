package TestNGpack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CypressEx {
	static WebDriver dr;
	
	
	public static void pricingvalidation() {
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.cypress.io/");
		List<WebElement> list = dr.findElements(By.tagName("a"));
		int size = dr.findElements(By.tagName("a")).size();
		System.out.println(size);
		List<String> s = new ArrayList<String>();
		for(WebElement e:list)
			s.add(e.getText());
		
		for(String a:s)
		System.out.println(a);
		for(String str : s) {
		if(str.equals("Pricing")) {
			
			System.out.println("pricing is displayed");
		}
		else
			continue;
			}
	}
	public static void installcypress() {
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.cypress.io/");
		WebElement hover = dr.findElement(By.id("dropdownDocs"));
		Actions act = new Actions(dr);
		act.moveToElement(hover).build().perform();
//		dr.findElement(By.xpath("//a[text()='Installing Cypress']")).click();
		dr.findElement(By.xpath("//*[contains(@href,'https://on.cypress.io/installing-cypress')]")).click();
		}
	public static void main(String[] args) throws Throwable {
	installcypress();
//	pricingvalidation();
}
	}
