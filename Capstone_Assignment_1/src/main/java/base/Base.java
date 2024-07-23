package base;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.*;
import java.time.Duration;
public class Base {
	
	static WebDriver driver;
	
	public WebDriver launchBrowser() {
		WebDriverManager.edgedriver().setup();
		this.driver = new EdgeDriver();
		return driver;
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicitWait(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void explicitWaitUntilClickable(WebDriver driver, WebElement ele) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void explicitWaitUntilTitle(WebDriver driver, String title, WebElement ele) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.titleIs(title));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public Object[][] readFromExcel(String filepath) throws IOException{
		String[][] data;
		FileInputStream fin = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum()+1;
		int columnCount = sheet.getRow(0).getLastCellNum();
		data= new String[rowCount-1][columnCount];
		for(int i=1;i<rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType()) {
				case NUMERIC: {data[i-1][j]= Integer.toString((int) cell.getNumericCellValue()); break; }
				case STRING: {data[i-1][j]=cell.getStringCellValue(); break; }
				}	
				System.out.print("|"+data[i-1][j]+"|");
			}System.out.println();
		}
		return data;
	}
	
	public String captureScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("src/../Screenshots/"+System.currentTimeMillis()+".png");
		FileHandler.copy(source, dest);
		return dest.getAbsolutePath();
	}
	
	public void scrollToElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public void fileWriter(String filepath, String orderPlacement) throws IOException {
		FileWriter file = new FileWriter(filepath, true);
		file.write(orderPlacement);
		file.close();
	}
}
