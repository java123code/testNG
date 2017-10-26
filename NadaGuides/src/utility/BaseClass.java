package utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	 public static Logger Log = Logger.getLogger(BaseClass.class.getName());
	    public static WebDriver driver;  
	
	
	 @BeforeClass(alwaysRun=true)
	    public void setUp() {
	        try {
	            driver = Utils.Initialize();
	            Log.info("setUp() method has executed successfully");
	            Reporter.log("setUp() method has executed successfully");
	        } catch (Exception e) {
	            Log.error("setUp() method has not executed successfully");            
	            Log.debug("setUp() method has not executed successfully  | "
	                    + new Object() {
	                    }.getClass().toString() + " | method " + new Object() {
	                    }.getClass().getEnclosingMethod().getName());
	            Reporter.log("setUp() method has not executed successfully");
	            Assert.fail(e.getMessage());
	        }
	    }
	 
	 @AfterClass
	 public void cleanUp()
	 {
		 driver.quit();
		 
	 }
}
