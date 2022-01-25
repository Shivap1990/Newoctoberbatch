package pageclass.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class registertest {
	
	//@FindBy annotation
	WebDriver driver;
	
	@FindBy(how =How.LINK_TEXT,using="REGISTER")
	WebElement link;
	
	@FindBy(how =How.NAME,using="firstName")
	WebElement fname;
	
	@FindBy(how =How.NAME,using="lastName")
	WebElement lname;
	
	public void clicklink() 
	{
		link.click();
	}
	
	public void setfirstname(String fn) 
	{
		fname.sendKeys(fn);
	}
	
	public void Setlastname(String ln) 
	{
		lname.sendKeys(ln);
	}
     
	registertest(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}
}
