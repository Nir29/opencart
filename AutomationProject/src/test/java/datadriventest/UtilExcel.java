package datadriventest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilExcel {
    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;

    public static int getRowCount(String xlfile, String xlsheet) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        int rowcount = ws.getLastRowNum();
        wb.close();
        fi.close();
        return rowcount;
    }

    public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi); // FIXED: Added missing workbook initialization
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        int cellcount = 0;
        if (row != null) {
            cellcount = row.getLastCellNum();
        }
        wb.close();
        fi.close();
        return cellcount;
    }

    public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        String data = "";
        if (row != null) {
            cell = row.getCell(colnum);
            try {
                DataFormatter formatter = new DataFormatter();
                data = formatter.formatCellValue(cell);
            } catch (Exception e) {
                data = "";
            }
        }
        wb.close();
        fi.close();
        return data;
    }

    public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);

        if (ws.getRow(rownum) == null) {
            row = ws.createRow(rownum);
        } else {
            row = ws.getRow(rownum);
        }

        cell = row.createCell(colnum);
        cell.setCellValue(data);

        fi.close(); // close input stream before writing

        fo = new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fo.close();
    }
}



   