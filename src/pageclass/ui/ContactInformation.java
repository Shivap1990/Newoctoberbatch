package pageclass.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactInformation {
	//class level declaration of driver
			WebDriver driver;
			//finding web elements firstname & lastname text fields
			By register= By.linkText("REGISTER");
			By fname=By.name("firstName");
			By lname= By.name("lastName");
			By phone = By.name("phone");
			By email = By.name("userName");
			
			public void clickregister() {
				driver.findElement(register).click();
			}
			
			public void setfirstname(String fn) 
			{
				driver.findElement(fname).sendKeys(fn);
         	}
			
			public void setlastname(String ln) 
			{
				driver.findElement(lname).sendKeys(ln);
			}
			public void setphonenumber(String ph) 
			{
				driver.findElement(phone).sendKeys(ph);
			}
			public void setemail(String eml) 
			{
				driver.findElement(email).sendKeys(eml);
			}
			public ContactInformation(WebDriver driver) {
				this.driver=driver;
			}
		
	}

