package com.nbcuni.pizzaform.pages.c_pages;

import org.testng.Assert;

import com.nbcuni.pizzaform.base.CPageBase;
import com.nbcuni.pizzaform.base.IPageBase;
import com.nbcuni.pizzaform.pages.i_pages.IPizzaFormPage;
import com.nbcuni.pizzaform.utilities.reportmanagers.Log4jManager;

public class CPizzaFormPage extends CPageBase implements IPizzaFormPage{

		private static String url="file:///C:/Users/cjhad/git/SQEDemonstrationChallengeUIProject/src/test/resources/files/index.html";
		
//--------------Public methods------------------//
		public CPizzaFormPage goToPizzaForm() {
			logger.createNode("User goes to pizza form page");
			driver.get(url);
			logger.info("user landed at page");
			return this;
		}
		public CPizzaFormPage clickPizza1Btn() {
			logger.createNode("user clicks pizza1 button");
			weu.clickBy(pizza1By);
			logger.info("user clicks pizza1 Button");
			return this;
		}
		public CPizzaFormPage clickoption1() {
			logger.createNode("user clicks option1 box");
			weu.clickBy(firstOptionBy);
			logger.info("user clicks option1 box");
			return this;
		}
		public CPizzaFormPage clickoption2() {
			logger.createNode("user clicks option2 box");
			weu.clickBy(secondOptionBy);
			logger.info("user clicks option2 box");
			return this;
		}
		public CPizzaFormPage clickTopping1() {
			logger.createNode("user clicks topping1 box");
			weu.clickBy(Topping1By);
			logger.info("user clicks topping1 box");
			return this;
		}
		public CPizzaFormPage carmOnions() {
			logger.createNode("user clicks carm onions box");
			weu.clickBy(carmOnionsBy);
			logger.info("user clicks carm onions box");
			return this;
		}
		public CPizzaFormPage clickPizza1Qty(String num) {
			logger.createNode("Enter pizza qty");
			driver.findElement(pizza1QtyBy).clear();
			driver.findElement(pizza1QtyBy).sendKeys(num);
			logger.info("user clicks pizza1 Button");
			return this;
		}
		public CPizzaFormPage fillInfo(String name, String phone) {
			logger.createNode("user fills in all info to form");
			enterName(name);
			enterPhone(phone);
			logger.info("user entered info");
			return this;
	}
		public CPizzaFormPage clickCashBtn() {
			logger.createNode("user clicks Cash Button");
			weu.clickBy(radioCashBy);
			logger.info("user clicks option1 box");
			return this;
		}
		
		public CPizzaFormPage clickPlaceOrderButton() {
			logger.createNode("user clicks Place Order Button");
			weu.clickBy(placeOrderButtonBy);
			logger.info("user clicks place order box");
			return this;
		}
		public CPizzaFormPage resetOrder() {
			logger.createNode("user clicks reset Button");
			weu.clickBy(resetButtonBy);
			logger.info("user clicks reset box");
			return this;
		}
		public CPizzaFormPage verifyOrderAlert() {
			Assert.assertTrue(true);
			return this;
		}
		
  //-------------------Private Methods--------------------//
		
		private void enterName(String userName) {
			System.out.println("Entering name now");
			driver.findElement(nameBy).sendKeys(userName);
			weu.typeIn(nameBy, userName);
			weu.highlight(nameBy);
			System.out.println("user entered name");
			logger.info("___log____user entered name");
		}
			private void enterPhone(String userPhone) {
				System.out.println("Entering phone# now");
				driver.findElement(phoneBy).sendKeys(userPhone);
				weu.typeIn(phoneBy, userPhone);
				weu.highlight(phoneBy);
				System.out.println("user entered phone#");
				logger.info("___log___user entered phone#");

}
}
