package etruckingSolution;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Base;

public class T extends Base {
	
	
	 
	  
	  @Parameters({"fname", "lname"})
	  @Test(groups="regression")
	  public void t1(String fname, String lname) { 
		  System.out.println("t1: "+ fname+" "+lname);
		  }
	  
	  @DataProvider(name="dp")
		public Object[][] getData() {
			Object[][] obj = new String[2][2];
			obj[0][0]="101";
			obj[0][1]= "Kaur";
			obj[1][0]="102";
			obj[1][1]="Kaur"; 
			return obj;
		}
	  @Test(dataProvider="dp") 
	  public void t2(String fname, String lname) 
	  { 
		  System.out.println("t2: "+fname+" "+lname); 
	  }
	 
	@Parameters("webAddress")
	@Test 
	public void t3(String d) {
		System.out.println("t3: "+d);
	}
	
	

}
