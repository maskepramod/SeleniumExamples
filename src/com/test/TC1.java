package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC1 {

	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This will execute beffore every class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This will execute beffore every class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This will execute before method");
	}
	
	@AfterClass
	public void aftermethod()
	{
		System.out.println("This will execute after method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is test1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("This is test2");

	}
}
