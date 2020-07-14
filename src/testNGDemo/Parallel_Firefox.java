package testNGDemo;

import org.testng.annotations.Test;

public class Parallel_Firefox
{
		
		@Test
		public void launch()
		{
			System.out.println("Launch firefox");
		}
		
		@Test
		public void login()
		{
			System.out.println("Login-firefox");
		}
		
		@Test
		public void details()
		{
			System.out.println("details-firefox");
		}
		
		@Test
		public void logout()
		{
			System.out.println("Logout-firefox");
		}
}
