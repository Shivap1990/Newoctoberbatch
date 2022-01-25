package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findframebyindex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 
		 driver.manage().window().maximize();
		 // switch to frame by index
		/*driver.switchTo().frame(0);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@aria-label=\"Play\"]")).click();*/
		 
		 //switch to frame by id or name
		/* driver.switchTo().frame("a077aa5e");
		 driver.findElement(By.xpath("//*[@src=\"Jmeter720.png\"]")).click();*/
		
		 
		 // switch to frame by web element
		 WebElement element =driver.findElement(By.id("a077aa5e"));
		 
		 driver.switchTo().frame(element);
		 driver.findElement(By.xpath("//*[@src=\"Jmeter720.png\"]")).click();
		 
		 // switch back to default web page /content
		 driver.switchTo().defaultContent();
		 driver.switchTo().parentFrame();
		 driver.findElement(By.xpath("//*[@type='text']")).sendKeys("pattewarsmgraminpoly@gmail.com");
		 System.out.println("Complete");
		 
	}

}

