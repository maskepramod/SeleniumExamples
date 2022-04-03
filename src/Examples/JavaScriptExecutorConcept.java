package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
	
	///	driver.get("https://ui.cogmento.com/");
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		System.out.println("Before Login Title is:=="+driver.getTitle());
		 		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("pramodmaske1978@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Anirudh_2020");
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	
	    WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
	
	     flash(loginbtn, driver);
	    drawBorder(loginbtn,driver);
	    refreshBrowserByJS(driver);
	}

		public static void flash(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String bgcolor = element.getCssValue("backgroundColor");
				
				for(int i=0; i<100;i++)
				{
					changeColor("rgb(0,200,0",element,driver);
					changeColor(bgcolor, element,driver);
				}
			
		}
		
		public static void changeColor(String color, WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
			try
			{
				Thread.sleep(2000);
				
			}catch(InterruptedException e)
			{
			}
		}
		
		public static void drawBorder(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border = 3px solid red'", element);
		}
		
		public static void refreshBrowserByJS(WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("history.go(0)");

		}

}
