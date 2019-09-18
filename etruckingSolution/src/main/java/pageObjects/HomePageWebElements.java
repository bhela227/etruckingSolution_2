package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class HomePageWebElements {
	
	WebDriver driver;
	public HomePageWebElements(WebDriver driver) {
		this.driver=driver;
	}
	
	By login = By.xpath("//ul[@id='vu_mm-top']/li[6]/a");
	
	public WebElement login() {
		
	    return driver.findElement(login);
	}
	
	
	
}
