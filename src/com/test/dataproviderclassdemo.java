package com.test;

import org.testng.annotations.DataProvider;

public class dataproviderclassdemo {


	@DataProvider(name="LoginDataProvider")
	
	public Object[][] getData()
	{
		Object  data[][] = {{"abc@gmail.com","abc"},{"pqr@gmail.com","pqr"},{"xyz@gmail.com","xyz"}};
		return data;
	}
}
