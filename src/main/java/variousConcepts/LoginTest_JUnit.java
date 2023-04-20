package variousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {

	WebDriver driver;

	@BeforeClass
	public static void B4Class() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void A4Class() {
		System.out.println("After class");
	}

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Selenium2022\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		System.out.println("Before");
	}

	@Test
	public void LoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		// driver.findElement(By.className("font-12")).click();
		System.out.println("postive test case");
	}

	@Test
	public void NegLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios32312.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click login button
		driver.findElement(By.name("login")).click();
		// driver.findElement(By.className("font-12")).click();
		System.out.println("negative test case");
	}

	@Test
	public void NegLogintest3() {
		driver.findElement(By.id("username1")).sendKeys("demo@techfios32312.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click login button
		driver.findElement(By.name("login")).click();
		// driver.findElement(By.className("font-12")).click();
		System.out.println("test case3");
	}

	@After
	public void Teardown() {
		// driver.manage().wait(1);
		driver.close();
		// driver.quit();
		System.out.println("after");
	}

}