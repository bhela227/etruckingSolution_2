package etruckingSolution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class Guru99 extends Base{
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		WebDriver driver;
		driver = initializeDriver();
	}
	
	
	// TC1: Valid User name and password
	@Parameters({"url", "password", "username"})
	@Test
	public void loginValid(String url, String password, String username) {
		//driver.get("http://www.demo.guru99.com/V4/");
		driver.get(url);
		//driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr215898 ");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YjAqyvU");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Bank Manager HomePage"));
	}
	
	@Test
	public void  invalid_username() {
		
	}
	
	
	
	

}
