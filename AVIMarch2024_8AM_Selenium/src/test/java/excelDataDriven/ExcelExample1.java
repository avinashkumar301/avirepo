package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample1 
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\SAKHA TECH\\Desktop\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("people");
		//XSSFRow row = sheet.getRow(1);
		//XSSFRow row = null;
		XSSFCell cell = null;
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		//System.out.println((int)row.getCell(1).getNumericCellValue());
		for(int i=0;i<rowcount;i++) {
			XSSFRow row = sheet.getRow(i+1);
			int cellVal = (int)row.getCell(1).getNumericCellValue();
			System.out.println(cellVal);
			if((int)row.getCell(1).getNumericCellValue()<18) {
				cell = row.getCell(2);
				cell.setCellValue("Minor");
			}else {
				cell = row.getCell(2);
				cell.setCellValue("Mazor");
			}
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SAKHA TECH\\Desktop\\data.xlsx");
		wb.write(fos);
		wb.close();
		fis.close();
		
	}
	

}
