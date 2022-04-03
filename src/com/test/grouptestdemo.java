package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class grouptestdemo {
	
	@Test(groups= {"Sanity"})
	public void test1()
	{
		System.out.println("This is the sanity testcase1");
	}
	
	@Test(groups= {"Sanity"})
	public void test2()
	{
		System.out.println("This is the sanity testcase2");
	}
	@Test(groups= {"Regression"})
	public void test3()
	{
		System.out.println("This is the Regression testcase1");
	}

	@Test(groups= {"Regression"})
	public void test4()
	{
		System.out.println("This is the Regression testcase2");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void test5()
	{
		System.out.println("This is the Sanity & Regression testcase2");
	}
	
}
