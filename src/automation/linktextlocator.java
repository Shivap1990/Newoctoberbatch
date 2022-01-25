package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextlocator {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		WebDriver w = new ChromeDriver();
		
		w.get("https://www.amazon.in/");
		
		// by using linkText() locator
		
		w.findElement(By.linkText("Best Sellers")).click();
		
		System.out.println("successful");
	
	}

}
