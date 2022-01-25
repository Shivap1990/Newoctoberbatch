package automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class databasetesting {
	
		public static void main(String[] args) throws SQLException {
			String firstname="shivshankar";
			String lastname="pattewar";
			String email="spshiva19@gmail.com";
			String telephone="8329284541";
			String password="Shiva123";
			
			
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/register");
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.findElement(By.name("firstname")).sendKeys(firstname);
			driver.findElement(By.name("lastname")).sendKeys(lastname);
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("telephone")).sendKeys(telephone);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("confirm")).sendKeys(password);
			driver.findElement(By.name("newsletter")).click();
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost3306/openshop", "root","");
			Statement ste=con.createStatement();
			String quary="select firstname,lastname";
			ResultSet rs=ste.executeQuery(quary);
			while(rs.next()) {
			
				String Firstname=rs.getString("shivshankar");
				String Lastname=rs.getString("pattewar");
				String Email=rs.getString("spshiva19@gmail.com");
				String Telephone=rs.getString("8329284541");
				String password1=rs.getString("Shiva123");
			if(firstname.equals(Firstname) && lastname.equals(Lastname) && email.equals(Email) &&  telephone.equals(Telephone)) {
				System.out.println("record found");
			}
		}}



}
