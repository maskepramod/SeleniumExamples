package Examples;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\Gramin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
		String str = driver.getTitle();
		System.out.println(str);
		
		if(str.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("InCorrect Title");	
		}
	//	System.out.println(driver.getPageSource());	
	}

}
