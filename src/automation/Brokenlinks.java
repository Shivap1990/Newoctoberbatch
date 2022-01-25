package automation;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Brokenlinks {
	

		public static void main(String[] args) throws IOException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver(); 
			driver.get("http://www.deadlinkcity.com/");
			List <WebElement> Link=driver.findElements(By.tagName("a"));
			int brokenlink = 0;
			
			for(WebElement element:Link) {
				String url=element.getAttribute("href");
				if(url==null || url.isEmpty()) {
					System.out.println("URL is Empty");
					continue;
				}
				URL link=new URL(url);
				try {
				HttpURLConnection Connection=(HttpURLConnection) link.openConnection();
				Connection.connect();
				if(Connection.getResponseCode()>=400) {
					System.out.println(Connection.getResponseCode()+url+"   is"+"      Broken link");
					brokenlink++;
				}
				else {
					System.out.println(Connection.getResponseCode()+url+"   is"+"      valid link");
				}}
				catch(Exception e) {
			}
		

	}}}


