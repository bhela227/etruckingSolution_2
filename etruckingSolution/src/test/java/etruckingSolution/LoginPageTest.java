package etruckingSolution;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObjects.HomePageWebElements;
import pageObjects.LoginPageWebElements;
import resources.Base;

public class LoginPageTest extends Base{
	
	
	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeDriver();
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
	
	@Test(priority=1)
	public void signin() throws InterruptedException {
		driver.get("https://www.etruckingsolution.com/");
		LoginPageWebElements lpwe =new LoginPageWebElements(driver);
		
		Set<String> wh;
		Iterator<String> it;
		//driver.findElement(By.xpath("//ul[@id='vu_mm-top']/li[6]/a")).click();
		HomePageWebElements hp = new HomePageWebElements(driver);
		hp.login().click();
		
		//explicitWait.until(ExpectedConditions.)
		Thread.sleep(3000);
		wh = driver.getWindowHandles();
		it = wh.iterator();

		System.out.println(wh.size());
		String main = it.next();
		String child = it.next();

		System.out.println(main + ",   " + child);

		driver.switchTo().window(child);
		explicitWait.until(ExpectedConditions.urlContains("Login"));
		
		lpwe.username().sendKeys("bhela227");
		lpwe.password().sendKeys("bombay420A$");
		lpwe.signin().click();
driver.findElement(By.xpath("//*[@id='menu-content']/li[4]/a")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@id='3']/a[1]/li/span"))));
		
		
		driver.findElement(By.xpath("//ul[@id='3']/a[1]/li/span")).click();
		
		driver.findElement(By.xpath("//button[@class='btn_custom_new1']")).click();
		
		driver.findElement(By.xpath("//input[@class='chk_lft4']")).click();
		
		driver.findElement(By.xpath("//input[@id='Fname']")).sendKeys("Gurmail");
		driver.findElement(By.xpath("//input[@id='Mname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='Lname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id='Phoneid']")).sendKeys("9164774777");
		driver.findElement(By.xpath("//input[@id='Application_Date']")).sendKeys("08-31-2019");
		driver.findElement(By.xpath("//section[@id='main-content']/section/div[1]")).click();
		driver.findElement(By.xpath("//input[@id='SocialSecurityNumberid']")).sendKeys("111-11-1111");
		driver.findElement(By.xpath("//input[@id='EmergencyContactName']")).sendKeys("Unknown");
		driver.findElement(By.xpath("//input[@id='EmergencyPhoneid']")).sendKeys("916-123-1234");
		driver.findElement(By.xpath("//input[@id='LicenseNo']")).sendKeys("E1476867");
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Global Truck"));
	
		
	}
	
	
		
	}
	
	

	
	


