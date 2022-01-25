package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	// method ----1
	/*By element = By.id("twotabsearchtextbox");
	
	WebElement ele = driver.findElement(element);
	
	ele.sendKeys("oppo");
	
	//ele.clear();
	
	By element1 = By.id("nav-search-submit-button");
	
	WebElement ele1 = driver.findElement(element1);
	
	ele1.click();*/
	
	// method--2
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Earphones");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	System.out.println("Completed");

	}

}
