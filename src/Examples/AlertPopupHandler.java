package Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertPopupHandler {

	public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();

 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://deliver.courseavenue.com/PopupTest.aspx");
		
		driver.findElement(By.id("ctl00_ContentMain_popupTest")).click();

		Thread.sleep(2000);
		
		Set <String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String ParentWindow = it.next();
		System.out.println("Parent windows id:"+ ParentWindow);
		
		String ChildWindow = it.next();
		System.out.println("Parent windows id:"+ ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		System.out.println("child windows popup titile" + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		System.out.println("Parent windows popup titile" + driver.getTitle());


	}

}
