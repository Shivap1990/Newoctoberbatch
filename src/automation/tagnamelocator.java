package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamelocator {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		// by using tagName() locator
		
		driver.findElement(By.tagName("input")).sendKeys("Chrismas");
		
		//by using class name locator
		
		//driver.findElement(By.className("gNO89b")).click();
		
		System.out.println("successful");

	}

}
