package pageObjects;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;



public class LoginPage {
	private static Logger    Log = Logger.getLogger(LoginPage.class.getName());
	private static WebElement webElement = null; 
	
	 public static WebElement nadaImageHomePage(WebDriver driver){
         try{
             webElement = driver.findElement(By.xpath("//*[@id='hdr-logo']"));
             Log.info("nadaImageHomePage is available on the Homepage");
         }catch(Exception e){
             webElement= null;
             Log.error("nadaImageHomePage is NOT available on the Homepage  | " + new Object(){}.getClass().toString() + " | method " + new Object(){}.getClass().getEnclosingMethod().getName());
             Log.debug(e.getLocalizedMessage());
             Reporter.log("nadaImageHomePage is NOT available on the Homepage");                
         }
         return webElement;
     }
	 
	 public static WebElement findTheRightCarButton(WebDriver driver){
         try{
             webElement = driver.findElement(By.xpath("//*[@class='page-btn btn-white btn-huge']"));
             Log.info("Find the right car is seen on the Homepage");
         }catch(Exception e){
             webElement= null;
             Log.error("Find the right car is Not seen on the Homepage  | " + new Object(){}.getClass().toString() + " | method " + new Object(){}.getClass().getEnclosingMethod().getName());
             Log.debug(e.getLocalizedMessage());
             Reporter.log("Find the right car is Not seen on the Homepage");                
         }
         return webElement;
     }
	 
	 public static WebElement homePageTopBar(WebDriver driver){
         try{
             webElement = driver.findElement(By.xpath("//*[@id='hdr-smnav']/li[1]/a"));
             Log.info("homePageTopBar is seen on the Homepage");
         }catch(Exception e){
             webElement= null;
             Log.error("homePageTopBar is Not seen on the Homepage  | " + new Object(){}.getClass().toString() + " | method " + new Object(){}.getClass().getEnclosingMethod().getName());
             Log.debug(e.getLocalizedMessage());
             Reporter.log("homePageTopBar is Not seen on the Homepage");                
         }
         return webElement;
     }

}
