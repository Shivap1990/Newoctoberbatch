package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktextlocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		// by using PartialLinkText () locator
		
		driver.findElementByPartialLinkText("Mo").click();
		
		System.out.println("successful");
		
		

	}

}
