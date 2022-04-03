package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgFeatures {

	   @Test
	    public void loginTest() {
	    	System.out.println("Login Test");
	  //  int i=9/0;
	    }
	   
	   @Test(dependsOnMethods="loginTest")
	    public void homePageTest() {
		 	System.out.println("Home Page Test");   
	   }
	   
	   
	   @Test(dependsOnMethods="loginTest")
	    public void searchTest() {
		 	System.out.println("Search Test");   
	   }
	   
	   
	   @Test(dependsOnMethods="loginTest")
	    public void RegistrationPageTest() {
		 	System.out.println("Registration Page Test");   
	
	   }
	   

}	

