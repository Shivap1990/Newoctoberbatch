package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertiontest {

	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver/chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void logotest() 
	{
		//WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		//WebElement logo = driver.findElement(By.linkText("Best Sellers"));
		//Assert.assertTrue method
		//Assert.assertTrue(logo.isDisplayed(),"logo is not displayed on screen");
		//Assert.assertFalse method
		//Assert.assertFalse(logo.isDisplayed(),"logo is displayed on screen");
		WebElement radio=driver.findElement(By.xpath("//*[starts-with(@for,'u_0_5_')]"));
		//radio.click();
		Assert.assertTrue(radio.isSelected(),"radio is not selected");
		//Assert.assertFalse(radio.isSelected(), "radio is not selected");
	}
	
	/*@Test(priority=2)
	public void homepagetitle() 
	{
		String title=driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals method check found message is equal to or not expected message
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}*/
	
	/*@AfterClass
	public void teardown() 
	{
		driver.quit();
	}*/
}
