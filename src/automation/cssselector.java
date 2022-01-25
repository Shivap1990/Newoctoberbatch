package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");	  
	  
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	 // driver.get("https://www.amazon.in/");
	  
	  // by css selector tag with id(tag#id)
	  
	  //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone");
	  
	// driver.get("https://www.calculator.net/");
	  // by using css selector tag with classname (tag.class)
	 // driver.findElement(By.cssSelector("input.inlongest")).sendKeys("addition");
	  
	  // by using tag & attribute tag[attribute='value']
	  
	  //driver.findElement(By.cssSelector("span[id= 'bluebtn'")).click();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  // by using tag & attribute tag[attribute='value']
	  driver.findElement(By.cssSelector("input[title=\"Search for products, brands and more\"]")).sendKeys("iphone");
	  
	  // by using tag,class & attribute tag.class[attribute='value']
	  driver.findElement(By.cssSelector("button.L0Z3Pu[class=\"L0Z3Pu\"]")).click();
	  
	 /* driver.get("https://reqres.in/");
	  driver.findElement(By.cssSelector("h2.tagline")).click();*/
	  System.out.println("completed");
	  
	  
	  
	  
	
	}
}