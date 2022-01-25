package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassdoubleclickmethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		// doubleclick method
	WebElement	doubleclick=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	act.doubleClick(doubleclick).perform();
	Thread.sleep(2000);
	String a =driver.switchTo().alert().getText();
	System.out.println(a);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("completed");
	
	}

}
