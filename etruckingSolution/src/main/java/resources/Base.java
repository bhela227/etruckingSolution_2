package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Base {
	
	 
	
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	
	public WebDriver initializeDriver() throws IOException {
		
		

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\saini\\eclipse-workspace\\etruckingSolution\\src\\main\\java\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		String browserName = p.getProperty("browserName");
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"..\\etruckingSolution\\BrowserDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("chromedriver")){
			
			System.setProperty("webdriver.chrome.driver",
					"..\\etruckingSolution\\src\\main\\java\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		explicitWait = new WebDriverWait(driver, 5);

		return driver;

	}
	
	public void getScreenshot(String r) throws IOException {
		
		 
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\saini\\Desktop\\sc\\"+r+"screenshot.png"));
	}

	
}
