package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelementsmethod {

	public static void main(String[] args) {
		
		// set property for web driver
		WebDriverManager.chromedriver().setup();
		
		// initalize chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//List<WebElement> links =driver.findElements(By.tagName("input"));
		
		List<WebElement> links1 =driver.findElements(By.linkText(""));
	//	int nooflinks = links.size();
		
	//	System.out.println("No. of links on web page"+nooflinks);
		
		/*for(int i =0;i<links.size();i++)
		{
			System.out.println(links.get(i));
		}*/
		
		/*for(Object var:links)
		{
			System.out.println(var);
		}*/
		System.out.println("completed");
		
		

	}

}
