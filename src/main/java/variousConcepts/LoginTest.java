package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		// set up system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Selenium2022\\crm\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		// object to evoke browser
		WebDriver driver = new ChromeDriver();
		
		// delete all cookies
		driver.manage().deleteAllCookies();
		
		// go to website
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		
		// maximize
		driver.manage().window().maximize();
		
		// insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		// click login button
	    driver.findElement(By.name("login")).click();
		// driver.findElement(By.className("font-12")).click();
	    // driver.manage().wait(1);
	    
	    driver.close();
	}
	
	
}
