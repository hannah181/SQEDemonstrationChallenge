package com.nbcuni.pizzaform.tests;

import org.testng.annotations.Test;

import com.nbcuni.pizzaform.base.TestBase;
import com.nbcuni.pizzaform.pages.c_pages.CPizzaFormPage;

public class PizzaFormTest extends TestBase{
	
	@Test
	public void happypathTest() {
		//Go to pizza form
		//click choose pizza box
		//select first option
		//enter qty
		//enter name and phone
		//click cash option
		//submit order
		//verify order alert
		
		 CPizzaFormPage p1 = new CPizzaFormPage();
		logger=extent.createTest("happypathTest");
		//new LandingPage()
		p1.goToPizzaForm()
		.clickPizza1Btn()
		.clickoption1()
		.clickPizza1Qty("2")
		.fillInfo("Jane Do", "320-435-2244")
		.clickCashBtn()
		.clickPlaceOrderButton()
		.verifyOrderAlert();

	}
	public void pause(int seconds) {
		 try {
		  Thread.sleep(seconds*1000);
		 } catch (InterruptedException e) {
		  e.printStackTrace();
		 }
}
	
	@Test
	public void defectDisplayTest() {  //Reset Button defect: Does not reset topping box
		//Go to pizza form
		//click choose pizza box
		//select second option
		//select topping 1 box
		//select carmelized onions
		//enter qty
		//enter name and phone
		//click cash option
		//submit order
		//click reset
		
		CPizzaFormPage p1 = new CPizzaFormPage();
		logger=extent.createTest("happypathTest");
		//new LandingPage()
		p1.goToPizzaForm()
		.clickPizza1Btn()
		.clickoption2()
		.clickTopping1()
		.carmOnions()
		.clickPizza1Qty("2")
		.fillInfo("Jane Do", "320-435-2244")
		.clickCashBtn()
		.resetOrder();
	}
	}
