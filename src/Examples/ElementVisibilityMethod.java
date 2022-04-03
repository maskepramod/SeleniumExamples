package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
	
	///	driver.get("https://ui.cogmento.com/");
		driver.get("https://register.freecrm.com/register/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		boolean b1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[5]/button")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[5]/button")).isEnabled();
		System.out.println(b2);
		
		driver.findElement(By.linkText("I Agree to the terms and conditions")).click();
		boolean b3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[5]/button")).isDisplayed();
		System.out.println(b3);

 
		
	
	}

}