package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://jqueryui.com/");
			
			Actions act = new Actions(driver);
			
			WebElement mouseover = driver.findElement(By.linkText("Contribute"));
			act.moveToElement(mouseover).perform();

			WebElement CLA = driver.findElement(By.linkText("CLA"));
			act.moveToElement(CLA).click().build().perform();
			Thread.sleep(5000);
			
			System.out.println("Completed");
		
	}

}
