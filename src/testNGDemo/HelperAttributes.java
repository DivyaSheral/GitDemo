package testNGDemo;

import org.testng.annotations.Test;

public class HelperAttributes 
{
	
	@Test(enabled=true)
	public void test()
	{
		System.out.println("Actual Test");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Actual Test 3");
	}	
	
	@Test(timeOut=3000)
	public void test2()     
	{
		System.out.println("Actual Test 2");
	}
	
	@Test(dependsOnMethods= {"test2","test3"})
	public void atest1()
	{
		System.out.println("Test1");
	}
	
	
}
