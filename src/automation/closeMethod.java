package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.quit();
		
		//driver.close();

	}

}
