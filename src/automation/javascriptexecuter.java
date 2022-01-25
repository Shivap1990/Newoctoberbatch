package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecuter {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		
		// creating javascriptexecuter interface object by type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		driver.findElement(By.name("uid")).sendKeys("mngr377113");
		driver.findElement(By.name("password")).sendKeys("yzurEnY");
	
		// click action by javascriptexecutor interface
		js.executeScript("arguments[0].click();", button);
		driver.switchTo().alert().accept();
		
		// to generate alert window using javascriptexecutor, display message
		js.executeAsyncScript("alert('Welcome to selenium automation');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		// vertical scroll by 400 pixels
		//js.executeAsyncScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		//refresh the browser
		js.executeScript("history.go(0)");
		
		//get inner text of a webpage
		//String text = js.executeScript("return document.documentElement.innerText;").toString();
	  //   System.out.println("Inner text of a webpage: "+text);
	     
	     // get title of a webpage
	     String text1 = js.executeScript("return document.title;").toString();
	     System.out.println("Title of a web page: "+text1);
		System.out.println("complete");
		

	}

}
