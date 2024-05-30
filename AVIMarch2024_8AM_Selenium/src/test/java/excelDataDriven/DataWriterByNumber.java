package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWriterByNumber 
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\SAKHA TECH\\Desktop\\testdata1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		 XSSFCell cell = row.getCell(4);
		 cell.setCellValue("passed");
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\SAKHA TECH\\Desktop\\testdata1.xlsx");
		 wb.write(fos);
		 wb.close();
		 fis.close();
	}

}
