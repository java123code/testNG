package myFirstPackages1;

import org.testng.annotations.*;

public class OpenBrowser {
	
	
	@BeforeMethod
	public static void openBrowserHere()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public static void test1()
	{
		System.out.println("Test 1");
	}
	
	
	@BeforeTest
	public static void testBefore()
	{
		System.out.println("Before Test ");
	}
	
	@Test
	public static void test2()
	{
		System.out.println("Test 2 ");
	}
	
	@AfterTest
	public static void testAfter()
	{
		System.out.println("After Test");
	}
	
	@AfterMethod
	public static void openBrowserHere2()
	{
		System.out.println("After Method");
	}
	
	@BeforeSuite
	public static void openBeforeSuiteExe()
	{
		System.out.println("Before Suite");
	}
	
	
	@AfterSuite
	public static void openAfterSuiteExe()
	{
		System.out.println("After Suite");
	}

}
