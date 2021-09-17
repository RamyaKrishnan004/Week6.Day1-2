package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplement extends BaseClass2{
	@Before
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		 driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@After
	public void postCondition() {
		driver.close();

}}
