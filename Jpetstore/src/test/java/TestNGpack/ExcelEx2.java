package TestNGpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx2 {

	public String[][]  getExcelData(String fileName, String sheetName) {
		String[][] data = null;
	    try {
 
	        FileInputStream fis = new FileInputStream(fileName);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet(sheetName);
	        XSSFRow row = sheet.getRow(0);
	        int noOfRows = sheet.getPhysicalNumberOfRows();
	        int noOfCols = row.getLastCellNum();
	        Cell cell;
	        data = new String[noOfRows - 1][noOfCols];
 
	        for (int i = 1; i < noOfRows; i++) {
	            for (int j = 0; j < noOfCols; j++) {
	                row = sheet.getRow(i);
	                cell = row.getCell(j);
	                data[i - 1][j] = cell.getStringCellValue();
	                System.out.println(data);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("The exception is: " + e.getMessage());
	    }
	    return data;
	    
	   
	    
	    	
}
	}

	
	