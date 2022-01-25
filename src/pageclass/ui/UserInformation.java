package pageclass.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInformation {
	WebDriver driver;
	
	By uname = By.name("email");
	By password = By.name("password");
	By cpassword = By.name("confirmPassword");
	By submit =By.name("submit");
	
	public void setusername(String user) 
	{
		driver.findElement(uname).sendKeys(user);
	}
	public void setpassword(String pwd) 
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void confirmpassword(String cpwd) 
	{
		driver.findElement(cpassword).sendKeys(cpwd);
	}
	public void clicksubmit() 
	{
		driver.findElement(submit).click();
	}
	public UserInformation(WebDriver d) {
		driver=d;
	}
}
