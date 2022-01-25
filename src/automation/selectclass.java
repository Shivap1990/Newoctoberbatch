package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shivshankar");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label=\"Surname\"]")).sendKeys("pattewar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("8329284541");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("shiva@123");
		Thread.sleep(2000);
         
		WebElement date =driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		
		Select seldate = new Select(date);
		seldate.selectByIndex(0);
		Thread.sleep(2000);
		
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		Select selmonth = new Select(month);
		selmonth.selectByValue("7");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
		Select selyear = new Select(year);
		selyear.selectByVisibleText("1990");
		Thread.sleep(2000);
		
		WebElement radio =driver.findElement(By.xpath("//label[@startwith=\"u_0_\"]"));
		
		Select radiobutton = new Select(radio);
		radiobutton.selectByVisibleText("Male");
		
		System.out.println("completed");
		
	}

}
