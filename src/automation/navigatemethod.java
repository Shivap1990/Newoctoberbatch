package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver/chromedriver.exe");
		
		// step 1- open chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// step 2 - open google homepage
		
		driver.get("https:\\www.google.com/");
		
		// step 3 - wait 2 sec & display title & url name as o/p
		Thread.sleep(2000);
		
		String t = driver.getTitle();
		String u = driver.getCurrentUrl();
		System.out.println("Title of web page is: "+t);
		System.out.println("Current URL is: "+u);
		
		//step 4- open facebook application
		driver.navigate().to("https://www.facebook.com/");
		String t1 = driver.getTitle();
		String u1 = driver.getCurrentUrl();
		System.out.println("Title of web page is: "+t1);
		System.out.println("Current URL is: "+u1);
		
		//step 5 - wet for 2 sec & open goibibo.com
		Thread.sleep(2000);
		driver.navigate().to("https://www.goibibo.com/");
		
		// step 6 - wait 3 sec & go back to fb
		Thread.sleep(3000);
		driver.navigate().back();
		
		// step 7- verify title of fb
		if(t1.contains("Facebook")) 
		{
			System.out.println("Title is matched-TestCase pass");
		}
		else 
		{
			System.out.println("Title doesn't match- test case fail");
		}
		
		//step 8- wait 3 sec & setSize
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(300,300));
		
		// step 9- wait 2 sec & setSize
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(400,300));
		
		// step 10- setPosition
		driver.manage().window().setPosition(new Point(500,100));
		
		// step 11 - wait 2 sec & move to amazon
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to("https:\\www.amazon.com/");
		
		// step 12- wait 2 sec & refresh browser
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		// step 13- wait 2 sec & close browser
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
				
				

	}

}
