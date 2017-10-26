package utility;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;

import config.Configuration;

public class Utils {

	
	 public static WebDriver driver = null ;
	// public static String 	browser = "chrome" ;
	// private static Logger Log = Logger.getLogger(Utils.class.getName());
	public static WebDriver Initialize() throws InterruptedException
	 {
		 if(driver == null)
		 {
			 System.out.println("Initialzing Browser Now....!!! ");
			 if(Configuration.Browser.browser.equalsIgnoreCase("firefox"))
			 {
				 driver = new FirefoxDriver();
			 }
			 else if(Configuration.Browser.browser.equalsIgnoreCase("chrome"))
			 {
				 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--disable-extensions");
					options.addArguments("disable-infobars");
					 driver = new ChromeDriver(options);
					 
						String baseUrl = Configuration.URL.app_url ;
						driver.get(baseUrl);
						driver.manage().window().maximize();
						Thread.sleep(15000);
			 }
			 else if(Configuration.Browser.browser.equalsIgnoreCase("ie"))
			 {
				 driver = new InternetExplorerDriver();
			 }
			 else
			 {
				 System.out.println("some issue with Opening Browser ");
			 }
			 
			
		 }
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 return driver;	 
	 }
	 
	 public void close()
	 {
		 System.out.println("Closing Browser");
		 driver.close();
		 driver =  null ;
	 }
	 
	 public void quit()
	 {
		 System.out.println("Quiting Browser");
		 driver.quit();
		 driver =  null ;
	 }
	 
/*	 public static WebDriver setUp() throws Exception {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
			 driver = new ChromeDriver(options);
			
			  return driver;
	 }*/
	    
	    
}
