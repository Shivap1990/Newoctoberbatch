package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriventesting {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		// automate FB application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("E:\\software testing\\Java notes//InputFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//returns row count
		int rowcount = sheet.getLastRowNum();
		System.out.println("No. of records in excel sheet are: "+rowcount);
		int colcount = sheet.getRow(1).getLastCellNum();//return cell count
		System.out.println("cell count is: "+colcount);
		for(int row=1;row<rowcount;row++) {
			XSSFRow current_row = sheet.getRow(row);
			String firstname = current_row.getCell(0).getStringCellValue();
			String lastname = current_row.getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(firstname);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(lastname);
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
				
		}
		System.out.println("Script executed");
		driver.close();
	}
}
