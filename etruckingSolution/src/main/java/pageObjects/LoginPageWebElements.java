package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageWebElements {
	WebDriver driver;
	public LoginPageWebElements(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("UserName");
	By password = By.id("Password");
	By signin = By.xpath("//*[@id=\"frmLogin\"]/div/button");  
	
	public WebElement username() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement signin() {
		return driver.findElement(signin);
	}
	
	

}
