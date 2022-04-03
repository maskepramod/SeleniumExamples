package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorconcpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
	
		//1.xpath     
		   driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Anirudh");
	    	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Maske");
		
		//2. id
	//  driver.findElement(By.id("firstname")).sendKeys("Pramod");
	//  driver.findElement(By.id("lastname")).sendKeys("Maske");

		//3. name
	//	driver.findElement(By.name("firstname")).sendKeys("Pramod");
    //	driver.findElement(By.name("lastname")).sendKeys("Maske");

	//	4 LinkText.
	//  driver.findElement(By.linkText("Sign in")).click();
 
		//5. partial link
//	 	driver.findElement(By.partialLinkText("User Privacy")).click();

		//6.css selector
    //	driver.findElement(By.cssSelector("#firstname")).sendKeys("Anirudh");
	    	
	    	//7. classname
	 	driver.findElement(By.className("action-link")).click();
		
	 
	}

}
