package etruckingSolution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class listeners implements ITestListener {
	

		Base b = new Base();
	
	
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTestStart");
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTestSuccess");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTestFailure");
		String r = result.getName();
		
		try {
			b.getScreenshot(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("OnTestFinish");
		
		
		// TODO Auto-generated method stub
		
	}

}
