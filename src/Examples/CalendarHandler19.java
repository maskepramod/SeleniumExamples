package Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandler19 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://spicejet.com/");
	 
		//WebElement date = driver.findElement(By.className("css-76zvg2 css-bfa6kz r-homxoj r-ubezar"));
		
		WebElement date = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//child::div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']"));
		String datevalue = "30-12-2021";
		
		selectDateByJS(driver, date, datevalue);

	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal)
	{
	JavascriptExecutor 	js = ((JavascriptExecutor) driver);
	
	js.executeScript("arguments[0].setAttribute('value',"+dateVal+"');", element);
 	}
}
