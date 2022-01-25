package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitlywaitcommand {
	// wait for entire webpage to load elements for specified time

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Title of web page is: "+driver.getTitle());
		//implicitly wait for 10 seconds to load webpage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[@autocomplete=\"off\"]")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input.button")).click();
		
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement mouseover= driver.findElement(By.xpath("//*[@id='welcome']")); 
		
		act.moveToElement(mouseover).click().build().perform();
	
		WebElement logout = driver.findElement(By.linkText("Logout"));
		act.moveToElement(logout).click().perform();
		Thread.sleep(10);
		driver.close();
		System.out.println("Completed");
		

	}

}
