package myFirstPackages1;

import org.testng.annotations.*;

public class SuiteLevelExe {

	@Test
	public static void openBrowser()
	{
		System.out.println("open browser test");
	}
	
	
	@Test(dependsOnMethods={"openBrowser"},alwaysRun=true)
	public static void openFlight()
	{
		System.out.println("open flight ");
	}
	
	@Test
	public static void paymentCheck(){
		
		System.out.println("payment is checked");
	}
}
