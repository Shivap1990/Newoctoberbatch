package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocator {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.navigate().to("https://www.calculator.net/");
		
		d.findElement(By.className("inlongest")).sendKeys("surface area calculator");
		
		d.findElement(By.id("bluebtn")).click();
		
		System.out.println("Complete");

	}

}
