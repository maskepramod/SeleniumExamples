package Examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.ebay.com/");
		
		WebElement item = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		
	    Select name = new Select(item);
	    
	    name.selectByIndex(11);
	    Thread.sleep(3000);
	    name.selectByVisibleText("Dolls & Bears");
		Thread.sleep(3000);
		name.selectByValue("20081");
	}

}
