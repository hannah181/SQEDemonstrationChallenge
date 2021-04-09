package com.nbcuni.pizzaform.utilities.reportmanagers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jManager {

    public static Logger log = LogManager.getLogger(Log4jManager.class);

    public static void info(String message) {
   	 log.info(message);

    }

    public static void debug(String message) {
   	 log.debug(message);
    }
    
    public static void error(String message) {
   	 log.error(message);
    }

    public static void warn(String message) {
   	 log.warn(message);

    }

    public static void fatal(String message) {
   	 log.fatal(message);
    }

     public static void startTestCase(String sTestCaseName){
     log.info("**************************************************************************");
     log.info("$$$$$$$$$$$$    	"+sTestCaseName+ "    	$$$$$$$$$$$$");
     log.info("**************************************************************************");
     }
    
     public static void endTestCase(){
     log.info("XXXXXXXXXXXXXXXX      	"+"---END of test case---"+"     	XXXXXXXXXXXXXXXX");
     log.info("X");
     log.info("X");
    
     }

}

