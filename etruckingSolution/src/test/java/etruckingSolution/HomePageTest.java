package etruckingSolution;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import pageObjects.HomePageWebElements;
import resources.Base;

public class HomePageTest extends Base{


  
	

	@BeforeMethod
	public void setUp() throws IOException {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saini\\eclipse-workspace\\etruckingSolution\\BrowserDriver\\geckodriver.exe");
//		driver = new FirefoxDriver();	
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver=initializeDriver();
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();;
	}

	@Test(priority = 1)
	public void homePage() throws IOException {
		
		
		driver.get("https://www.etruckingsolution.com/");

		String titleBarName = driver.getTitle();
		System.out.println("Title: " + titleBarName);
		//getScreenshot();

		Assert.assertTrue(titleBarName.contains("eTruckingSolutions"));
	
	}

	@Test(priority = 2)
	public void clickOnLoginButton() throws InterruptedException, IOException {
		
		driver.get("https://www.etruckingsolution.com/");
		HomePageWebElements hp = new HomePageWebElements(driver);
		Set<String> wh;
		Iterator<String> it;
		//driver.findElement(By.xpath("//ul[@id='vu_mm-top']/li[6]/a")).click();
		
		hp.login().click();
		Thread.sleep(3000);
		wh = driver.getWindowHandles();
		it = wh.iterator();

		System.out.println(wh.size());
		String main = it.next();
		String child = it.next();

		System.out.println(main + ",   " + child);

		driver.switchTo().window(child);

		String login = driver.getTitle();
		System.out.println("login: " + login);

		Assert.assertTrue(login.contains("Login - Global Truck"));
		
		
	

	}

	

}
