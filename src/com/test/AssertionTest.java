package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionTest {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=1)
	public void logoverifytest()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id='nav-logo-sprites']"));
		Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed on the page"));
	}
	@Test(priority=2)
	public void homePageTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title of WebPage is:"+title);
		Assert.assertEquals(title,"Online Shoping site in India:Shop Online for Mobiles, Books, Watches, Shoe and more")
	}

	

}
