package excelDataDriven;

public class DataManagement {

	public static void main(String[] args) throws Exception {
		ExcelAPI e = new ExcelAPI("C:\\Users\\SAKHA TECH\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testName =  "TestA";
		
		//To find the matching testcase row number
		
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testName))
		{
			testStartRowNum++;
		}
		System.out.println(testStartRowNum);

	}

}
