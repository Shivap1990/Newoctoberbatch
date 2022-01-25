package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassclickmethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement mouseover=driver.findElement(By.linkText("Contribute"));
		act.moveToElement(mouseover).build().perform();
		WebElement cla = driver.findElement(By.linkText("CLA"));
		act.moveToElement(cla).click().perform();
		System.out.println("Complete");
	}

}
