package com.test;

 
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class dataproviderdemo {

	@Test(dataProvider="LoginDataProvider",dataProviderClass=dataproviderclassdemo.class)
	6
	public void loginTest(Object email, Object pwd)
	{
		System.out.println(email+" "+pwd);
		
	}
}
/*	
	@DataProvider(name="LoginDataProvider")
	public Object[][] getData()
	{
		Object [][] data = {{"abc@gmail.com","abc"},{"pqr@gmail.com","pqr"},{"xyz@gmail.com","xyz"}};
		return data;
	}

*/