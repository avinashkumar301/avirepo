package excelDataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class ExcelExample2 {
	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\SAKHA TECH\\Desktop\\data.xlsx");
		String sheetName = "Testcase";
		String testName = "TC_008";
		FileInputStream fis = new FileInputStream("C:\\Users\\SAKHA TECH\\Desktop\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Testcase");
		XSSFRow row = null;
		XSSFCell cell = null;
		
		int testStartRowNum = 0;
		int colCount = 0;
		
		//XSSFRow row = sheet.getRow(0)
		
		int rowCount = e.getRowCount(sheetName);
		System.out.println(rowCount);
		
		for(int i=0;i<rowCount;i++) {
			row = sheet.getRow(i+1);
			System.out.println(row.getCell(0).getStringCellValue());
			if(row.getCell(0).getStringCellValue().trim().equals(testName)) {
				
				System.out.println("yes");
				System.out.println(row.getLastCellNum());
				for(int j=1;j<row.getLastCellNum();j++) {
					System.out.println(row.getCell(j).getStringCellValue());
					 XSSFCellStyle style = wb.createCellStyle();  
			            // Setting Background color  
			            style.setFillBackgroundColor(IndexedColors.GREEN.getIndex()); 
			            style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
			             

				}
				break;
				
			}
		}
	}
}
