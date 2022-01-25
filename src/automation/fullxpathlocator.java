package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fullxpathlocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/");
		
		By element =By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input");
		
		WebElement ele = d.findElement(element);

		  ele.sendKeys("spshiva19@gmail.com");
		  
		  d.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Sawi@123");
		  
	}

}
