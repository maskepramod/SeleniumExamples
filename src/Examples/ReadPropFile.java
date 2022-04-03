package Examples;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		

		Properties pro = new Properties();
		
		FileInputStream is = new FileInputStream("C:\\Users\\Gramin\\eclipse-workspace\\Seleniumpra\\src\\Examples\\config.properties");
		
		pro.load(is);
		
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("age"));

		String url = pro.getProperty("URL");
		System.out.println(url);

		String browsername = pro.getProperty("browser");
		System.out.println(browsername);

		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gramin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		} 
		else
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Gramin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(pro.getProperty("firstname_xpath"))).sendKeys(pro.getProperty("firstname"));
		driver.findElement(By.xpath(pro.getProperty("lastname_xpath"))).sendKeys(pro.getProperty("lastname"));
		driver.findElement(By.xpath(pro.getProperty("email_xpath"))).sendKeys(pro.getProperty("pramodmaske1978@gmail.com"));
		}	
	}	

 
