package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefoxautomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\firefoxdriver/geckodriver.exe");
		
       // FirefoxDriver driver= new FirefoxDriver();
   //     WebDriver driver1 = new FirefoxDriver();
        
        // initialize gecko driver using DesiredCapabilities class
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true);  
        WebDriver driver= new FirefoxDriver(capabilities);  
       
        // launch website
        driver.navigate().to("https://www.flipkart.com/");
        
        // Click on the Custom Search text box and send value  
        driver.findElement(By.id("gsc-i-id1")).sendKeys("mobile");
        
        // Click on the Search button  
        driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();    
	}

}
