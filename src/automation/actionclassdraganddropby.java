package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassdraganddropby {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		// create object of action class
		Actions act = new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		// move to slider
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
	     System.out.println("complete");	
		

	}

}
