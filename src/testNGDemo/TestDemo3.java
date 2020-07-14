package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo3 
{
	@Parameters({"User","Pass"})
	@Test
	public void login(String username ,String password)
	{
		System.out.println(username +"---"+password);
	}
	
	
	@BeforeSuite
	public void EnvironSetup()
	{
		System.out.println("Environment setup");
	}
	
	@BeforeMethod
	public void methodd()
	{
		System.out.println("Before method");
	}
	
	@Test(groups= {"Smoke"})
	public void testCase31()
	{
		System.out.println("Case 31");
	}
	@Test
	public void testCase32()
	{
		System.out.println("Case 32");
	}
	
	@BeforeClass
	public void test1()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void test2()
	{
		System.out.println("Afterclass class");
	}

}
