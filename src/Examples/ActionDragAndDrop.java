package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://jqueryui.com/droppable");
			
			Actions act = new Actions(driver);
			
			driver.switchTo().frame(0);
			
			WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
			
			WebElement tar = driver.findElement(By.xpath("//div[@id='droppable']"));
	
			Thread.sleep(5000);
			
			act.clickAndHold(src).moveToElement(tar).release().build().perform();
			
			//act.dragAndDrop(src, tar).build().perform();

	
	}
}
