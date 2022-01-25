package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.com/");
		
		By element =By.xpath("//input[@type= 'text']");
		
		WebElement ele = driver.findElement(element);
		
		ele.sendKeys("shoes");
		
		driver.findElement(By.xpath("//input[@id= 'nav-search-submit-button']")).click();*/
		
		driver.get("http://demo.guru99.com/");
		
		driver.findElement(By.xpath("//input[@maxlength ='50']")).sendKeys("pattewarsmgraminpoly@gmail.com");
		
		driver.findElement(By.xpath("//input[@name ='btnLogin']")).click();
		
		//driver.findElement(By.linkText("Agile Project")).click();
		
		driver.findElement(By.linkText("Bank Project")).click();
		
		driver.findElement(By.xpath("//input[@maxlength ='10']")).sendKeys("mngr377113");
		
		driver.findElement(By.name("password")).sendKeys("yzurEnY");
		
		driver.findElement(By.cssSelector("input[value=\"LOGIN\"]")).click();
		
		System.out.println("successful");

	}

}
