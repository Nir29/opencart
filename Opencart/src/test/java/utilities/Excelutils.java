package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutils {

 static Workbook book;
 static Sheet sheet;
	 
 public static String SHEET_PATH = System.getProperty("user.dir") + "/src/test/resources/TestData/opencartlogindetails.xlsx";
	 
	 
 public static Object[][] getTestDataFromExcel(String sheetName) {
 FileInputStream file = null;
	         //
   try {
	 file = new FileInputStream(SHEET_PATH);
     book = WorkbookFactory.create(file);
	 sheet = book.getSheet(sheetName);
	 
 } catch (IOException e) {
	 System.out.println("Either File Not Found! or workbook not created!");
	 }
	 
	 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	 
	         // 5x2
	 for (int i = 0; i < sheet.getLastRowNum(); i++) { // 0 to 4
	 for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
	 
	                 // First row email, password -> coumn name - skip - header
      data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
	 
	  }
	  }
	    return data;
	  }
	 
	 
	 }


