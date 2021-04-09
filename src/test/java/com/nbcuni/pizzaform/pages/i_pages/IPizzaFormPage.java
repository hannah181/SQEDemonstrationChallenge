package com.nbcuni.pizzaform.pages.i_pages;

import org.openqa.selenium.By;

import com.nbcuni.pizzaform.pages.c_pages.CPizzaFormPage;
import com.nbcuni.pizzaform.base.IPageBase;

public interface IPizzaFormPage extends IPageBase{

	
	/*************************Locators*************************/
	
		By pizza1By = By.xpath(document.selectSingleNode("//PizzaForm/pizza1By").getText() );
		By firstOptionBy = By.xpath(document.selectSingleNode("//PizzaForm/firstOptionBy").getText() );
		By secondOptionBy = By.xpath(document.selectSingleNode("//PizzaForm/secondOptionBy").getText() );
		By Topping1By = By.xpath(document.selectSingleNode("//PizzaForm/Topping1By").getText() );
		By carmOnionsBy = By.xpath(document.selectSingleNode("//PizzaForm/carmOnionsBy").getText() );
		By pizza1QtyBy = By.xpath(document.selectSingleNode("//PizzaForm/pizza1QtyBy").getText() );
		By nameBy = By.xpath(document.selectSingleNode("//PizzaForm/nameBy").getText() );
		By emailBy = By.xpath(document.selectSingleNode("//PizzaForm/emailBy").getText() );
		By phoneBy = By.xpath(document.selectSingleNode("//PizzaForm/phoneBy").getText() );
		By radioCashBy = By.xpath(document.selectSingleNode("//PizzaForm/radioCashBy").getText() );
		By placeOrderButtonBy = By.xpath(document.selectSingleNode("//PizzaForm/placeOrderButtonBy").getText() );
		By resetButtonBy = By.xpath(document.selectSingleNode("//PizzaForm/resetButtonBy").getText() );
		
		/****************Public Abstract Methods****************/
	
	public CPizzaFormPage goToPizzaForm();
	public CPizzaFormPage clickPizza1Btn();
	public CPizzaFormPage clickoption1();
	public CPizzaFormPage clickoption2();
	public CPizzaFormPage clickTopping1();
	public CPizzaFormPage carmOnions();
	public CPizzaFormPage clickPizza1Qty(String num);
	public CPizzaFormPage fillInfo(String name, String email);
	public CPizzaFormPage clickCashBtn();
	public CPizzaFormPage clickPlaceOrderButton();
	public CPizzaFormPage verifyOrderAlert();
	public CPizzaFormPage resetOrder();
}

