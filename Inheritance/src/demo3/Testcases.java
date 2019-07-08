package demo3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demo1.Driversclass;
import demo2.Propertiesclass;

public class Testcases extends Driversclass {

		//
		Propertiesclass page;
		@BeforeClass
		  public void beforeClass() {
			  browserLaunch("CHROME", "https://www.facebook.com");
		  }
		@Test
		  public void registration() throws Exception
		  {
			  page=new Propertiesclass(driver);
			  page.UserLogin();
		  }
	 
	  

	}
		
		
	
