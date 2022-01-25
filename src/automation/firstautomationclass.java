package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstautomationclass {

	public static void main(String[] args) {
		// 1st step set system property
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver/chromedriver.exe");
	
	//2nd step -- to initilaize the browser  to create a object
	
	 ChromeDriver driver= new ChromeDriver();
	 
	 // Launch Website
	 driver.navigate().to("http://amazon.com/");
	 
	 //fetch any url use get() method
	 driver.get("http://amazon.com/");
	 
	 // Maximize the browser
	 driver.manage().window().maximize(); 
	 
	 // scroll down webpage by 5000 pixels
	   JavascriptExecutor js = (JavascriptExecutor)driver;  
       driver.executeScript("scrollBy(0, 5000)");   
       
  	

	}

	}

