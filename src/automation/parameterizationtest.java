package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterizationtest {
	// parameters in TestNG
	//@Parameters("")
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters("browser")
	
	void verifytitle(String browserName) 
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		/*else if(browserName.equalsIgnoreCase("firefoxbrowser")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("iebrowser"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}*/
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Title of web page: "+driver.getTitle());
	}
	
	/*@Test(priority=2)
	 void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}*/
	
}
