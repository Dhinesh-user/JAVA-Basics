package TestNGpack;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelEx1 {
	public static void main(String[] args) throws IOException {

    
    FileInputStream file = new FileInputStream("C:\\Users\\PD20313015\\Downloads\\Mydata.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(file);
    XSSFSheet sheet = wb.getSheetAt(0);
    XSSFRow rw = sheet.getRow(0);
    int RowNum= sheet.getPhysicalNumberOfRows();
    System.out.println(RowNum);
    int ColNum = rw.getLastCellNum();
    System.out.println(ColNum);
    Cell cl;
    String val = null;
    for(int i=1;i<RowNum;i++) {
    	for(int j=0;j<ColNum;j++) {
    		rw = sheet.getRow(i);
    		cl = rw.getCell(j);
    		val = cl.getStringCellValue();
    		System.out.print(val+" ");
    		}
    	System.out.println();
    }
    
	}
    
    
    
   
}


