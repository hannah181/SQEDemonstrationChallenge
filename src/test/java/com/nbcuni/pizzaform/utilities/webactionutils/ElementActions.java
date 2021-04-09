package com.nbcuni.pizzaform.utilities.webactionutils;

import static com.nbcuni.pizzaform.utilities.reportmanagers.Log4jManager.error;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nbcuni.pizzaform.utilities.reportmanagers.Log4jManager;

public class ElementActions {
	
private WebDriver driver;
	
	public ElementActions(WebDriver incomingDriver) {
		this.driver = incomingDriver;
	}
	public void highlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;   
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element); 
	}
	public void highlight(By eleBy) {
		WebElement element = driver.findElement(eleBy);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
	    
	}
	public void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argumentsTest[0].click()", element);
	}
	public void stopfor(int seconds) {
		try {
		Thread.sleep(seconds*1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target);
		
		
	}
	
	public Alert getAlert() {   
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		
		return myAlert;
	}
	
	public void acceptAlert() {  
		getAlert().accept();
	}
	public void dismissAlert() {
		try {
		getAlert().dismiss();
		}catch(Exception e) {
			Log4jManager.error("Exception at dismissing alert");
			error("Exception at dismissing alert");
			
		}
	}
	
	public void clickBy(By elementBy) {  
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		try {
		WebElement theElement = wait.until(ExpectedConditions.elementToBeClickable(elementBy) );
		theElement.click();
	}catch(Exception e) {
		Log4jManager.error("Exception at clicking element " + elementBy.toString());
		 }
}
	public void typeIn(By eleBy, String textTobeSent) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			WebElement theElement = wait.until(ExpectedConditions.visibilityOfElementLocated(eleBy));
			theElement.sendKeys(textTobeSent);
		}catch(Exception e) {
			Log4jManager.error("Exception at clicking element " + eleBy.toString());
			System.out.println("failed to sendkeys to element"+ eleBy.toString());
		}
	}
	public WebElement findBy(By elementBy) { 
		WebElement ele = null; 
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		try { 
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy)); 
		}catch(Exception e) { 
		Log4jManager.error("failed to located element by: " + elementBy.toString()); 
		} 
		return ele; 
		}
}
