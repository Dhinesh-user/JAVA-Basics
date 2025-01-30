package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import PageObjects.LoginPagefact;

public class Example5PageFact {
static WebDriver dr;
	public static void main(String[] args) throws IOException {
		BrowserEx1 br = new BrowserEx1();
		dr = br.browserinit();
		LoginPagefact LP = new LoginPagefact(dr);

		FileInputStream file = new FileInputStream("C:\\Users\\PD20313015\\Downloads\\Mydata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row R1 = sheet.getRow(1);
		Cell c11 = R1.getCell(0);
		Cell c12 = R1.getCell(1);

	}

}
