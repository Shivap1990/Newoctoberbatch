package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocatormethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver di = new ChromeDriver();
		
		di.get("https://www.amazon.in/");
		
		di.manage().window().maximize();
		
		// 1. contains method---> //tagname[contains(@attribute,'value')]
		//di.findElement(By.xpath("//input[contains(@dir,'auto')]")).sendKeys("washing machine");
		
		// 2. using OR & AND
		
		/*di.findElement(By.xpath("//input[@type='text' and @id='twotabsearchtextbox']")).sendKeys("iphone");
		
		di.findElement(By.xpath("//*[@id='nav-search-submit-button' or @type='submit']")).click();
		
		System.out.println("Completed");
		
		//3. xpath Starts-with
		
		di.get("https://www.facebook.com/");
		
		di.findElement(By.xpath("//*[starts-with(@id,'u_0_2_')]")).click();
		
		di.findElement(By.xpath("//*[starts-with@id,'u_2_b_']")).sendKeys("Shivshankar");*/
		
	
		// 4. text() method
		di.findElement(By.xpath("//*[text()='Best Sellers']")).click();
		System.out.println("completed");		
		
           
	}

}
