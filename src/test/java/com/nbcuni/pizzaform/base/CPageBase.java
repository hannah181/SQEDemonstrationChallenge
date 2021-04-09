package com.nbcuni.pizzaform.base;

import com.nbcuni.pizzaform.utilities.reportmanagers.TestListener;
import com.nbcuni.pizzaform.utilities.webactionutils.ElementActions;
import com.nbcuni.pizzaform.utilities.webactionutils.WaitUtil;

public class CPageBase extends TestListener {

	protected ElementActions weu = new ElementActions(driver);
	protected WaitUtil waits= new WaitUtil(driver);
}
