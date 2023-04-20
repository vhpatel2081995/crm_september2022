package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_HW1 {
	
	WebDriver driver;
	
	@Before
	public void init(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\patel\\Selenium2022\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		// absolute xpath method
		//driver.findElement(By.xpath("html/body/section/div/nav/div/ul/li[10]/a")).click();
		
		
	} 
   @Test
	public void LoginCssTest() {
		driver.findElement(By.cssSelector("input#username")).sendKeys("demo@techfios.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		// cssSelecyor href method
		driver.findElement(By.cssSelector("i[class ='fa fa-university']")).click();
		driver.findElement(By.cssSelector("a[href='https://techfios.com/billing/?ng=accounts/add/']")).click();
		driver.findElement(By.cssSelector("input#account")).sendKeys("GIC-Account");
		driver.findElement(By.cssSelector("input[name='description']")).sendKeys("tutionT22");
		driver.findElement(By.cssSelector("input#balance")).sendKeys("1200");
		driver.findElement(By.cssSelector("input[id='account_number']")).sendKeys("12344321");
		driver.findElement(By.cssSelector("input#contact_person")).sendKeys("Vir");
		driver.findElement(By.cssSelector("input#contact_phone")).sendKeys("6666664444");
		driver.findElement(By.cssSelector("input[id='ib_url']")).sendKeys("www.selenium.com");
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
   }
   
   @Test
   public void LoginXPathTest() {
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
	   driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("abc123");
	   driver.findElement(By.xpath("//button[@name='login']")).click();

	  /* WebDriverWait wait = new WebDriverWait(driver,60);
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//i[@class ='fa fa-university']")).click()));*/
	   driver.findElement(By.xpath("//i[@class='fa fa-university']")).click();
	   driver.findElement(By.xpath("//a[text()='New Account']")).click();
	   driver.findElement(By.xpath("//input[@id='account']")).sendKeys("GIC");
	   driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Bap nu Acc");
	   driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("1100");
	   driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("23455432");
	   driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("virtu");
	   driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("12345543244");
	   driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("23455432");
	   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   }
   
	@After
	public void Teardown() {
		driver.close();
	}
}
