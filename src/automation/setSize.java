package automation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Dimension dim = new Dimension(200,300);
		
		driver.manage().window().setSize(dim);
		
		Thread.sleep(3000);
		
		Point p=new Point(300,500);
		
		driver.manage().window().setPosition(p);
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		System.out.println("Complted");
	}

}
