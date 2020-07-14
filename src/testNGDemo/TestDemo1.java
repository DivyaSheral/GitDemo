package testNGDemo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo1 
{
	
	@Parameters({"User","URL"})
	@Test
	public void signUp(String username,String urlName)
	{
		System.out.println(username);
		System.out.println(urlName);
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Case 2");
	}

}
