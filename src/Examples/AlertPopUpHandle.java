package Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
				
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Thread.sleep(5000);
		
		driver.findElement(By.name("proceed")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    
	    String text = alert.getText();
	    
	  // Assert.assertEquals(text, "Correct alert message");
	     if(text.equals("Please enter a valid user name"))
	    {
	    	System.out.println("Correct alert message");
	    	
	    }
	    else
	    {
	    	System.out.println("InCorrect alert message");	
	    } 
	    	
	    Thread.sleep(5000);
	    alert.accept();
	    
	    //alert.dismiss();  // to click on cancel button if available
	
	}

}
