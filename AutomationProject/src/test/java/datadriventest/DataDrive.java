package datadriventest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrive {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testdata//test data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("sheet1");
        int rows=sheet.getLastRowNum();
        int cells=sheet.getRow(1).getLastCellNum();
        for(int r=0;r<=rows;r++) {
        	XSSFRow currentrow=sheet.getRow(r);
        	for(int c=0;c<cells;c++) {
        		XSSFCell cell=currentrow.getCell(c);
        		System.out.print(cell.toString()+" ");
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
	}

}
