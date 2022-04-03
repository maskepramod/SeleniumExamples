package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	    driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.name("email")).sendKeys("pramodmaske1978@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anirudh_2020");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
	 	driver.switchTo().frame(0).findElement(By.xpath("//*[@id=\\\"main-nav\\\"]/div[3]/a/i")).click();
		
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//*[@id=\\\\\\\"main-nav\\\\\\\"]/div[3]/a/i"))).click().build().perform();
		 
		action.click().moveToElement(driver.findElement(By.xpath("/html/body/iframe[1]"))).click();
			
	   
		 
//		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	//	driver.findElement(By.xpath("/html/body/iframe[1]")).click();
		
	}	
	

}
