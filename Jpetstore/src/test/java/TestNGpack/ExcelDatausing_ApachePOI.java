package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatausing_ApachePOI {
      static  List<String> uslist = new ArrayList<String>();
       static  List<String> pwlist = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("C:\\Users\\PD20313015\\Downloads\\Mydata.xlsx");
	    XSSFWorkbook wb = new XSSFWorkbook(f);
	    XSSFSheet s= wb.getSheetAt(0);
	    Iterator<Row> rowiterator = s.iterator();
	    while(rowiterator.hasNext()) {
	    	Row rowvalue = rowiterator.next();
	    	Iterator<Cell> celliterator = rowvalue.iterator(); 
	    	int i=2;
	    	while(celliterator.hasNext()) {
	    		if(i%2==0) {
	    			uslist.add(celliterator.next().getStringCellValue());
	    		}
	    		else {
	    			pwlist.add(celliterator.next().getStringCellValue());
	    	}
	    		i++;
	    }
	    
	}
System.out.println(uslist);
System.out.println(pwlist
		);
	}
	}
