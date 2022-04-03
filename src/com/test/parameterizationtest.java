package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationtest {
	
	
	WebDriver driver;
	
	
	
	@Test(priority=1)
	@Parameters("browser")
			
	void verifytitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("gecko"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Gramin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
						
		}
		else
		{
			System.out.println("Existed");
					
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
	}

	@Test(priority=2)
	void teardown()
	{
		driver.quit();
	}
}
