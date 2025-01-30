package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilities {

	WebDriver driver;
	public String[][] ExcelReadMethod(String FilePath) throws IOException {
		FileInputStream fin = new FileInputStream(FilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String[][] data= null;
		int NoRow = sheet.getLastRowNum()+1;
		int NoCol = sheet.getRow(0).getLastCellNum();
		data = new String[NoRow][NoCol];
		
		for(int i=0;i<NoRow;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<NoCol;j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		return data;
	}
	
	public String takeScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("src/../ErrImage/"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(source, dest);
		return dest.getAbsolutePath();
	}
}
