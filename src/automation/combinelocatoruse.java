package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class combinelocatoruse {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\firefoxdriver/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realmi mobiles");
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).click();

		driver.findElement(By.linkText("Best Sellers")).click();
		
		driver.findElement(By.tagName("div")).click();
		
		//driver.findElement(By.tagName("p")).click();
		
		//driver.findElement(By.tagName("a")).click();
		
		driver.findElement(By.name("ssubmit.add-to-registry.wishlist.unrecognized")).click();
		
		System.out.println("successful");
	}

}
