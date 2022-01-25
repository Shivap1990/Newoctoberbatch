package automation;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclassmovetoelement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
	WebElement	mouseover=driver.findElement(By.linkText("Support"));
	act.moveToElement(mouseover).build().perform();
	//System.out.println("Complete");
	
	WebElement Learningcenter=driver.findElement(By.linkText("Learning Center"));
       act.moveToElement(Learningcenter).click().build().perform();
       System.out.println("success");
       
	}

}
