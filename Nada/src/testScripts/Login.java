package testScripts;


import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utility.BaseClass;
import utility.Utils;


public class Login extends BaseClass {
	//public static Logger Log = Logger.getLogger(Login.class.getName()); 
	private static WebElement webElement = null; 
	//public WebDriver driver = null ;
	
	@Test
	public void verifyHomePage() throws InterruptedException
	{
			System.out.println("First- 1 test is under progress ");
			WebElement webelement = driver.findElement(By.xpath("//h1[text()='FIND THE RIGHT CAR NOW']")) ;
	
			if(webelement.isDisplayed())
			{
				System.out.println("Find the Right Car is visible ");
				Log.info("Successfully click on maintenance link ");
			}
			else
			{
				System.out.println("Find the Right Car is Not visible ");
				Log.error("Maintenance link isn't visible");
	            Reporter.log("Maintenance link isn't visible");
	            Assert.fail("Maintenance link isn't visible");
			}
	}
	
	@Test(dependsOnMethods={"verifyHomePage"})
	public void checkLogin1() throws InterruptedException{
	
		System.out.println("Second -2  test is under progress ");
		Thread.sleep(15000);
		System.out.println("Nadapage is open 1");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		WebElement webelement = driver.findElement(By.xpath("//*[@id='txtATCZipHP']")) ;
		if(webelement.isDisplayed())
		{
			Log.info("Successfully click on maintenance link ");
		}
		else
		{
			Log.error("Maintenance link isn't visible");
            Reporter.log("Maintenance link isn't visible");
            Assert.fail("Maintenance link isn't visible");
		}
		webelement.clear();
		webelement.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='txtATCZipHP']")).sendKeys("92614");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='submitSmallFYC']")).click();

	}
	
	@Test(dependsOnMethods={"checkLogin1"})
	public void checkLogin2() throws InterruptedException{
		System.out.println("Third -3  test is under progress ");
		System.out.println("Nadapage is open 2");
		Thread.sleep(5000);
		
		WebElement webelement =driver.findElement(By.xpath("//*[@id='submitSmallFYC']")) ;
		if(webelement.isDisplayed())
		{
			Log.info("Successfully click on maintenance link ");
		}
		else
		{
			Log.error("Maintenance link isn't visible");
            Reporter.log("Maintenance link isn't visible");
            Assert.fail("Maintenance link isn't visible");
		}
		webelement.click();
	}
	
	
	
	
/*	@Test
	@Parameters("browser")
	public void verifyHomePage(String browserName) throws InterruptedException
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.out.println("Its firefox here");
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("Its chrome here");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("disable-infobars");
		    driver = new ChromeDriver(options);
			String baseUrl = "http://www.nadaguides.com/";
			driver.get(baseUrl);
			driver.manage().window().maximize();
			Thread.sleep(15000);
			
		}
		else
		{
			System.out.println("no browser here");
		}
	}*/
	
	
/*	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		String baseUrl = "http://www.nadaguides.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}*/
	
	/*@AfterMethod
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}*/
	
	
/*	@Test(dependsOnMethods={"verifyHomePage"})
	public void checkLogin1() throws InterruptedException{
	
		
		Thread.sleep(15000);
		System.out.println("Nadapage is open 1");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)", "");
		WebElement webelement = driver.findElement(By.xpath("//*[@id='txtATCZipHP']")) ;
		webelement.clear();
		webelement.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='txtATCZipHP']")).sendKeys("92614");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='submitSmallFYC']")).click();
      
	}
	
	@Test(dependsOnMethods={"checkLogin1"})
	public void checkLogin2() throws InterruptedException{

		
		System.out.println("Nadapage is open 2");
			Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='submitSmallFYC']")).click();
	}*/
	
	//@Test
	//public void checkLogin() throws InterruptedException{
	//public static void main(String[] args) throws Exception {
		
		//System.out.println("Nadapage is open");
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		

		String baseUrl = "http://www.nadaguides.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();*/
		//Thread.sleep(5000);
		
	//}
	
/*	
	@Test
	public void checkNadaImage() throws InterruptedException
	{
		Thread.sleep(5000);
		try{
            WebElement webElement = driver.findElement(By.xpath("//*[@id='hdr-logo']"));
            if(webElement.isDisplayed())
            {
            	Log.info(" checkNadaImage is seen");
            }
            else
            {
            	Log.info(" checkNadaImage is Not seen");
            }
            
            
        } catch (Exception e){
            Log.error("checkNadaImage is Not seen ");
            Log.debug(e.getLocalizedMessage());
            Reporter.log("checkNadaImage is Not seen ");
            Assert.fail("checkNadaImage is Not seen ");
        }
		Thread.sleep(5000);
	}*/
	
	/*@Test
	public void checkFindTheRightCar() throws InterruptedException
	{
		Thread.sleep(5000);
		try{
            WebElement webElement = LoginPage.findTheRightCarButton(driver);
            if(webElement.isDisplayed())
            {
            	Log.info(" checkFindTheRightCar is seen");
            }
            else
            {
            	Log.info(" checkFindTheRightCar is Not seen");
            }
            
            
        } catch (Exception e){
            Log.error("checkFindTheRightCar is Not seen");
            Log.debug(e.getLocalizedMessage());
            Reporter.log("checkFindTheRightCar is Not seen");
            Assert.fail("checkFindTheRightCar is Not seen");
        }
		Thread.sleep(5000);
	}*/
	

}
