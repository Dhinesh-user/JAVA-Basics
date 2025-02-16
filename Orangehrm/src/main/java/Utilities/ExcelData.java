package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public String[][] getExcelData(String filename,String sheetname) throws IOException{
		String[][] data =null;
		try {
			 
			FileInputStream fin = new FileInputStream(filename);
			XSSFWorkbook workbook = new XSSFWorkbook(fin);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int noofrow = sheet.getLastRowNum()+1;
			int noofcol = sheet.getRow(0).getLastCellNum();
			System.out.println(noofrow+ " "+ noofcol );
			
			data = new String[noofrow-1][noofcol];
			
			for(int i=1;i<=noofrow-1;i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<noofcol;j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
					System.out.println(data[i-1][j]);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("The exception is: " + e.getMessage());
	    }
		
		return data;
	}
}
