package testNGDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ListenerClass {
	
	@Test
	public void test1()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(false);
	}

}
