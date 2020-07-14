package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo2 
{
	@Parameters({"User","Pass"})
	@Test
	public void login(String username ,String password)
	{
		System.out.println(username +"---"+password);
	}
	@Test
	public void testCase21()
	{
		System.out.println("Case 21");
	}
	
	@Test(groups= {"Smoke"})
	public void testCase22()
	{
		System.out.println("Case 22");
	}

}
