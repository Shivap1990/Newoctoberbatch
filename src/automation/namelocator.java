package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		By ele =By.name("q");
		WebElement element = driver.findElement(ele);
		
		element.sendKeys("hp laptops");
		
		System.out.println("Completed");

	}

}
