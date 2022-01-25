package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassdraganddropmethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement trg = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		//to drag & drop
		//1st way
		act.dragAndDrop(src, trg).build().perform();
		
		// 2nd way
		/*act.clickAndHold(src).moveToElement(trg).release().build().perform();*/
		System.out.println("Completed");
		
		
		
		
		

	}

}
