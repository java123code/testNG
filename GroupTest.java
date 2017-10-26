package dataDriven;

import org.testng.annotations.*;

public class GroupTest {

	@Test
	@Parameters({"adminID"})
	public static void browserParameter(String adminID)
	{
		System.out.println("admisnID " + adminID + " pass id is : " );
	}
	
	
	
	@Test
	public static void openBrowser()
	{
		System.out.println("open browser test");
	}
	
	
	@Test(enabled=false,groups={"priority1"})
	public static void openFlight()
	{
		System.out.println("open flight 2222222222222");
	}
	
	
	@Test(groups={"priority1"})
	public static void openFlight1()
	{
		System.out.println("open flight 11111111");
	}
	
	@Test(groups={"priority1"})
	public static void openFlight2()
	{
		System.out.println("open flight 3333333333333");
	}
	
	@Test(groups={"priority2"})
	public static void openFlight4()
	{
		System.out.println("open flight 4444444");
	}
	
	@Test(groups={"priority2"})
	public static void openFlight5()
	{
		System.out.println("open flight 5555555555");
	}
	
	
	@Test
	public static void paymentCheck(){
		
		System.out.println("payment is checked");
	}
}
