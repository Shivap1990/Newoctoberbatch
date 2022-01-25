package automation;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@style=\"font-size:16px;\"]")).click();
		System.out.println(driver.getTitle());
		
		// getWindowHandle() method handle current window
		String parent=driver.getWindowHandle();
		System.out.println("The parent window is: "+parent);
		
		//getWindowHandles()-- handles all windows opened by selenium
		
		Set<String>s =driver.getWindowHandles();
		System.out.println("All windows are: "+s);
		
		//create object of Iterator
		java.util.Iterator<String> it = s.iterator();
		
		//while condition
		while(it.hasNext()) {
			String childwindow=it.next();
			if(!parent.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);//switch to child window
				driver.findElement(By.xpath("//*[@name=\"emailid\"]")).sendKeys("spshiva19@gmail.com");
				driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
				System.out.println("childwindow is:"+childwindow);
				//driver.close();
				Thread.sleep(3000);
				driver.switchTo().window(parent);
				Thread.sleep(3000);
				driver.switchTo().window(childwindow);
				Thread.sleep(2000);
				driver.close();
				//driver.quit();
			}
		}
		/*Thread.sleep(3000);
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		//driver.close();
		driver.quit();*/
		System.out.println("completed");
	}

}
