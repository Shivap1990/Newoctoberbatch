package pageclass.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class regtest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		/*registertest rgt = new registertest(driver);
		rgt.clicklink();
		rgt.setfirstname("Shivshankar");
		rgt.Setlastname("Pattewar");*/
		
		// create object of contactinformation class and call all methods in it
		ContactInformation cinfo= new ContactInformation(driver);
		cinfo.clickregister();
		Thread.sleep(2000);
		cinfo.setfirstname("Shivshankar");
		Thread.sleep(2000);
		cinfo.setlastname("Pattewar");
		Thread.sleep(2000);
		cinfo.setphonenumber("8329284541");
		Thread.sleep(2000);
		cinfo.setemail("pattewarsmgraminpoly@gmail.com");
		Thread.sleep(2000);
		//create object of Mailinginformation class and call all methods in it
		MailingInformation minfo = new MailingInformation(driver);
		minfo.setadress("hudco");
		Thread.sleep(2000);
		minfo.setcity("Nanded");
		Thread.sleep(2000);
		minfo.setstate("Maharashtra");
		Thread.sleep(2000);
		minfo.setpostalcode("431603");
		Thread.sleep(2000);
		minfo.selectcountry();
		Thread.sleep(2000);
		
		//create object of userinformationclass and call all methods in it
		UserInformation uinfo= new UserInformation(driver);
		
		uinfo.setusername("Shivap1990");
		Thread.sleep(2000);
		uinfo.setpassword("Shiva@123");
		Thread.sleep(2000);
		uinfo.confirmpassword("Shiva@123");
		Thread.sleep(2000);
		uinfo.clicksubmit();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("sign-in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("Shivap1990");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Shiva@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		System.out.println("completed");
		
		

	}

}
