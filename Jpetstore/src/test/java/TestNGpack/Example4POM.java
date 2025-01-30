package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class Example4POM {
	static WebDriver dr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BrowserEx1 br = new BrowserEx1();
		dr = br.browserinit();
		LoginPage LP = new LoginPage(dr);

		FileInputStream file = new FileInputStream("C:\\Users\\PD20313015\\Downloads\\Mydata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row R1 = sheet.getRow(1);
		Cell c11 = R1.getCell(0);
		Cell c12 = R1.getCell(1);

		LP.enterlink();
		LP.singinbtn();
		LP.usernam(c11.getStringCellValue());
		LP.passwrd(c12.getStringCellValue());

	}

}
