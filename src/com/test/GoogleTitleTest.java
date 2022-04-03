package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 


public class GoogleTitleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void asetup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
			
	}

	@Test
	  public void googleTitleTest() {
			String title = driver.getTitle();
			System.out.println(title);
			AssertJUnit.assertEquals(title, "Google", "title is not matchaed");
	
	}
	@Test
	public void logoTest()
	{
	boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();	
	AssertJUnit.assertTrue(b);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
