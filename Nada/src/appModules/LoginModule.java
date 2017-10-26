package appModules;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;



import pageObjects.LoginPage;

public class LoginModule {
	 private static Logger Log = Logger.getLogger(LoginModule.class.getName());
	
	public void checkHomePageTopBar(WebDriver driver)
	{
		if (! LoginPage.homePageTopBar(driver).isDisplayed()){
            Log.error(" has no home top bar, hence check logs");
            Reporter.log( " has no home top bar, hence check logs");
            Assert.fail( " has no home top bar, hence check logs");
        }
		else
		{
			Log.info(" checkHomePageTopBar is seen");
		}
	}

}
