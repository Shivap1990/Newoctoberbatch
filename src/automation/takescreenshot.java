package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takescreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver di = new ChromeDriver();
		di.get("https://www.amazon.in/");
		
		di.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung");
		
		di.findElement(By.xpath("//input[@type='submit']")).click();
		 // type casting
		TakesScreenshot src =(TakesScreenshot)di;
	File screenshot=	src.getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\software testing\\Java notes//defectpage.jpeg");
	FileUtils.copyFile(screenshot,dest);
	System.out.println("success");
	}
}
