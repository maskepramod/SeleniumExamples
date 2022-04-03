package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.History;
import com.gargoylesoftware.htmlunit.javascript.host.Window;



public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			JavascriptExecutor js = (JavascriptExecutor) driver ;
			
			driver.get("https://www.demo.guru99.com/v4/");
			
			WebElement button = driver.findElement(By.name("btnLogin"));
			
			driver.findElement(By.name("uid")).sendKeys("mnge369390");
			
			driver.findElement(By.name("password")).sendKeys("vadYzeb");
			
			js.executeScript("arguments[0].click();",button);
			
			js.executeScript("alert('Welcome to selenium')");

			js.executeScript("windows.scrollBy(0,400)");
			
			Thread.sleep(300);
			
			js.executeScript("history.go(0)");
	}
}

