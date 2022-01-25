package pageclass.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MailingInformation {
	 
	WebDriver driver;
	
	By adress = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By pcode = By.name("postalCode");
	By country = By.name("country");
	
	public void setadress(String ad) 
	{
		driver.findElement(adress).sendKeys(ad);
	}
	public void setcity(String ct) 
	{
		driver.findElement(city).sendKeys(ct);
	}
	public void setstate(String st) 
	{
		driver.findElement(state).sendKeys(st);
	}
	public void setpostalcode(String pc) 
	{
		driver.findElement(pcode).sendKeys(pc);
	}
	public void selectcountry() 
	{
		WebElement con =driver.findElement(country);
		Select selcon = new Select(con);
		selcon.selectByVisibleText("INDIA");
	}
	public MailingInformation(WebDriver d) {
		driver=d;
	}

}
