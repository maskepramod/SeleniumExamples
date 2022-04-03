package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/menu-title.html");
						
			Actions act = new Actions(driver);
		
			WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			
			act.contextClick(rightclick).build().perform();
			
			driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[1]")).click();
					
			String str = driver.switchTo().alert().getText();
			
			System.out.println(str);
			Thread.sleep(3000);
			driver.close();
			
			
	}

}
