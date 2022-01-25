package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafromexcel1 {

	public static void main(String[] args) throws IOException {
		// create object of file to store xlsx file
		File file = new File("E:\\software testing\\Java notes//InputFile.xlsx");
		
		//create object of fileinputstream class
		FileInputStream fis = new FileInputStream(file);
		
		//create object of XSSF workbook and select workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		// select sheet in workbook by creating object of XSSFsheet class
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// returns row count numeric value in sheet
		int rowcount=sheet.getLastRowNum();
		System.out.println("row count is: "+rowcount);
		
		// returns column count in sheet
		int colmncount =sheet.getRow(0).getLastCellNum();
		System.out.println("the cell no. is: "+colmncount);
		
		// nested loop
		for(int i=0;i<rowcount;i++) {
			XSSFRow currentrow = sheet.getRow(i);
			for(int j=0;j<colmncount;j++) {
				String value=currentrow.getCell(j).toString();
				System.out.print("   "+value);
			}
			System.out.println();
		}
		
		
		

	}

}
