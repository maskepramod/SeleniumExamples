package Examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://msbte.org.in//");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Regional Offices"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Pune Region")).click(); 
	}
}