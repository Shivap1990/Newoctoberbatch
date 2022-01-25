package automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertest {
	
	@Test(dataProvider="LoginDataProvider",dataProviderClass=DataProvider.class)
	
	public void loginTest(String email,Object pwd) 
	{
	System.out.println(email+" "+pwd);
	}

	@DataProvider(name="LoginDataProvider")
	public Object[][] getdata()
	{
		Object [][] data= {{"spshiva19@gmail.com","123"},{"pattewarsmgraminpoly@gmail.com","def"},{"pqr@gmail.com","xyz"}};
	      return data;
	}
}
