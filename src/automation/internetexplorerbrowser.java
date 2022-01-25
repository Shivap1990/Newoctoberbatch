package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexplorerbrowser {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.ie.driver","C:\\Users\\IE driver\\IEDriverServer.exe");
       
       WebDriver driver = new InternetExplorerDriver();
       
       driver.navigate().to("http://www.google.com/");
       
       driver.manage().window().maximize();
       
       driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
       
       driver.findElement(By.name("btnK")).click();  
       
       
	}
	

}
