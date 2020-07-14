package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo4 
{
	
	
	@BeforeSuite
	public void ctestCase41()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void atestCase42()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeMethod
	public void btestCase43()
	{
		System.out.println("@BeforeMethod");
	}
	
	@BeforeTest(groups = {"Smoke"})
	public void driverSetup()
	{
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void cleanUp()
	{
		System.out.println("@AfterTest");
	}
	@AfterMethod
	public void dtestCase44()
	{
		System.out.println("@AfterMethod");
	}
	
	@BeforeClass
	public void etestCase43()
	{
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void testCase44()
	{
		System.out.println("@AfterClass");
	}
	
	/*@Parameters({"User"})
	@Test
	public void signUpDetails(String username)
	{
		System.out.println(username);
	}
	
	@Test(groups = {"Smoke"})
	public void test()
	{
		System.out.println("Actual Test");
	}*/
	
	@Test
	public void atest1()
	{
		System.out.println("Test1");
	}

}
