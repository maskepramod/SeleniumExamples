package Examples;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	
		driver.get("https://msbte.org.in/");
	//	driver.get("https://ui.cogmento.com/");
	//	driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
  		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pramodmaske1978@gmail.com");
	//    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anirudh_2020");
	  //  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	
	  //  driver.findElement(By.xpath("//a[@class='item active']")).click();
	   // driver.switchTo().frame(mainframe);
	    
	    List <WebElement> linklist = driver.findElements(By.tagName("a"));
	    linklist.addAll(driver.findElements(By.tagName("img")));
	    
	    List <WebElement> activelinks = new ArrayList<WebElement>();
	    
	    for(int i=0;i<linklist.size();i++)
	    {
	    	if(linklist.get(i).getAttribute("href")!= null && (! linklist.get(i).getAttribute("href").contains("javascript"))){
	    		activelinks.add(linklist.get(i));
	    	}
	    }
	System.out.println("Size of active links and images--->"+activelinks.size());    
	
	for(int j=0;j<activelinks.size();j++)
    {
    HttpURLConnection c = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
	c.connect();
	String response = c.getResponseMessage();
	c.disconnect();
	System.out.println(activelinks.get(j).getAttribute("href")+ "--->"+response);
	}

	}
 
	}


