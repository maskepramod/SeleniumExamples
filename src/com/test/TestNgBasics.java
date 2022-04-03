package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgBasics {

		@BeforeMethod
		@BeforeMethod
		@BeforeMethod
		@BeforeSuite
		public void setUp() {
			System.out.println("setup system property for chrome");
		}
     	  @BeforeClass
		  public void lauchBrowser() {
     			System.out.println("lauch chrome browser");
     	  }
	
     	 @BeforeMethod
		  public void enterURL() {
    		 System.out.println("enter URL");
    	  }
 	 
     	  
     	@BeforeTest
     	public void login() {
 			System.out.println("Login to App");
     	}
	  	
	     	   		 		  
		@Test
		public void googleTitleTest() {
			 System.out.println("Google Title Test");
		}

		@Test
		public void searchTest()
		{
			 System.out.println("search Test");
		}
		
		@Test
		public void reload()
		{
			 System.out.println("reload");
		}

		@AfterMethod
		public void logout() {
 			System.out.println("Logout from App");			
		}
		@AfterTest
		public void deleteAllCookies() {
  			System.out.println("deleteAllCookies");
		}

		
		@AfterClass
			public void closeBrowser() {
  			System.out.println("close Browser");		
		}
  
		@AfterSuite
		public void generateTestReport() {
			System.out.println("generate Test Resport");
		}

}
