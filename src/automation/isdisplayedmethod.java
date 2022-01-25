package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayedmethod {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver/chromedriver.exe");
		
		ChromeDriver di = new ChromeDriver();
		
		di.get("https://demo.guru99.com/test/radio.html");

		di.manage().window().maximize();
		
		WebElement radio =di.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
		
		System.out.println("Is Displayed: "+radio.isDisplayed());
		//radio.click();
		System.out.println("Is Selected: "+radio.isSelected());
		System.out.println("Is Enabled: "+radio.isEnabled());

	}

}
