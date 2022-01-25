package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
	
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.get("https://www.amazon.in/");
		
		String titleofwebpage= driver.getTitle();
		
		System.out.println("Title of web page is: " +titleofwebpage);
		
		System.out.println("Completed");

	}

}
