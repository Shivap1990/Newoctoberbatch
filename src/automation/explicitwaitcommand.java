package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitcommand {

	public static void main(String[] args) throws InterruptedException {
		// wait for certain element to load before throwing exception

	 System.setProperty("webdriver.gecko.driver","C:\\Users\\firefoxdriver//geckodriver.exe");
	 
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();	
	 driver.get("https://www.softwaretestingmaterial.com/");
	 String title = driver.getTitle();
	 System.out.println(title);
	// this wait till 30 sec before throwing TimeoutException or if it finds element will return it
	 WebDriverWait wait = new WebDriverWait(driver,15);
	 boolean var= wait.until(ExpectedConditions.titleIs("Software Testing Material - Free Software Testing & Development Material"));
	System.out.println(var);
	Actions act = new Actions(driver);
	//driver.switchTo().alert().accept();
	WebElement dialogbox=driver.findElement(By.id("onesignal-slidedown-dialog"));
	act.moveToElement(dialogbox);
	WebElement cancel = driver.findElement(By.id("onesignal-slidedown-cancel-button"));
	act.moveToElement(cancel).click().build().perform();
	Thread.sleep(4000);
	
	// driver.close();
	 System.out.println("success");
	 
	}

}
