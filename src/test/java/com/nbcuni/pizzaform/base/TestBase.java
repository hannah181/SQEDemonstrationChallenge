package com.nbcuni.pizzaform.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.nbcuni.pizzaform.utilities.reportmanagers.TestListener;
import com.nbcuni.pizzaform.utilities.webactionutils.DriverUtil;

public class TestBase extends TestListener {
	 
  	 @BeforeTest 
  	 public void beforeAllTestCase() {
  		 onExtentSetup();
  	 }

  	 @AfterTest 
  	 public void afterAllTestCase() {
  		 extent.flush();
  	 }	
 	 
  	@BeforeMethod 
   public void beforeEachTestCase() {  
  //  String browser = System.getProperty("browser");
   driver = DriverUtil.startBrowser("Chrome");
    //driver = DriverUtil.startBrowserInPrivateMode(browser);
   // driver = DriverUtil.startDockerContainerBrowser("Chrome");
   }

	  @AfterMethod
	  public void shutdown() {
	   driver.quit();
}
}
