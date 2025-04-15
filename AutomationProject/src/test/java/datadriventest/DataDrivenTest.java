package datadriventest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//testdata//OpenCartLoginData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++) {
			XSSFRow currentrow=sheet.getRow(r);		
			
			for(int c=0;c<cells;c++) {
				XSSFCell currentcell=currentrow.getCell(c);
				System.out.print(currentcell.toString()+" ");
			}
			System.out.println(" ");
			}

	}

}
