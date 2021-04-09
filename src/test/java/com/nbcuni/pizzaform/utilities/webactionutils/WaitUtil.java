package com.nbcuni.pizzaform.utilities.webactionutils;

import org.openqa.selenium.WebDriver;

public class WaitUtil {


	private WebDriver driver;
	
	public WaitUtil(WebDriver inDriver) {
		this.driver = inDriver;
	
	}
	public void pause(int seconds) {
		   try {
		    Thread.sleep(seconds*1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
}
	}
}