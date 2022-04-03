package com.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersinterfacedemo implements ITestListener
{
	public void onStart(ITestContext arg)
	{
		System.out.println("Starts Test Execution...."+arg.getName());
	}

	public void onFinish(ITestContext arg)
	{
		System.out.println("Finish Test Execution...."+arg.getName());
	}
	
	public void onTestStart(ITestResult res)
	{
		System.out.println("Starts test...."+res.getName());
	}

	public void onTestSucess(ITestResult res)
	{
		System.out.println("Passed test...."+res.getName());
	}

	public void onTestFailure(ITestResult res)
	{
		System.out.println("Failure test...."+res.getName());
	}
	
	public void onTestSkipped(ITestResult res)
	{
		System.out.println("Skipped test...."+res.getName());
	}
	
}
