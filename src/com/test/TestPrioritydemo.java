package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestPrioritydemo {


  @Test(priority=10)
   public void setup()
  {
	  System.out.println("Opening Browser");
  }

  @Test(priority=20)
  public void login()
  {
	  System.out.println("This is login test");
  }

  @Test(priority=30,enabled=false)
  public void teardown()
  {
	  System.out.println("closing the browser");
  }


}


