package com.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Dependsondemo {


	@Test
	public void startBMW()
	{

		System.out.println("BMW Started");
		Assert.fail();
	}
	@Test (dependsOnMethods= {"startBMW"})
	public void driveBMW()
	{
		System.out.println("BMW is driving");

	}
	@Test
	public void stopBMW()
	{
		System.out.println("BMW Stopped");
	}

	@Test(dependsOnMethods= {"driveBMW","stopBMW"},alwaysRun=true)
	public void parkBMW()
	{
		System.out.println("BMW is parked successfully Stopped");
	}
}
