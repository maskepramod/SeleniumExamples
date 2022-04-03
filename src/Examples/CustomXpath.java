package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
	//	driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
	//	driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");

	//dynamic id: input
	// id= test_123
	// By.id("test_123")
	
	//starts with	
	// id= test_456
	// id= test_789
	// id= test_test_7890_test
		
	//ends with
	// id= 123_test_t
	// id= 23456_test_t	
	// id= 789_test_t
	//	driver.findElement(By.xpath("//input[contains(@id,'test_']")).sendKeys("Java");
	//	driver.findElement(By.xpath("//input[starts-with(@id,'test_']")).sendKeys("Java");
	//	driver.findElement(By.xpath("//input[ends-with(@id,'_test_t']")).sendKeys("Java");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}

}
