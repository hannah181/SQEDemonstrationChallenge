package com.nbcuni.pizzaform.base;

import org.dom4j.Document;
import static com.nbcuni.pizzaform.utilities.datamanagers.XmlReader.getData;;

public interface IPageBase {
		Document document = getData("/src/test/resources/files/locators.xml");
}
