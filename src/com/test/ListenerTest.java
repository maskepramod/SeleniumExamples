package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
//@Listeners(Listenersinterfacedemo.class)
public class ListenerTest {

	@Test
	void test1()
	{
		System.out.println("This is test1");
		AssertJUnit.assertEquals("A", "A");
		System.out.println("Test Passed");
	}
	@Test
	void test2()
	{
		System.out.println("This is test2");
		AssertJUnit.assertEquals("A", "B");
		System.out.println("Test Failed");
	}
	@Test
	void test3() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("This is test3");
		throw new SkipException("This is skip exception...");
	}
}
