package TestNGpack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonEx {
 static WebDriver dr;
	public static void Books() {
		WebDriverManager.chromedriver().setup();
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		dr.findElement(By.id("searchDropdownBox")).click();
		Select s = new Select(dr.findElement(By.id("searchDropdownBox")));
		List<WebElement> options = s.getOptions();
		List<String> opt = new ArrayList<String>();
		for(WebElement e:options)
			opt.add(e.getText());
		for(String menu:opt)
		System.out.println(menu);
		
		int index = opt.indexOf("Books");
		s.selectByIndex(index);
//		s.selectByVisibleText("Books");
		
	
	}
	public static void main(String[] args) throws Throwable {
	Books();
}

}
