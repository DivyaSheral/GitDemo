package testNGDemo;

import org.testng.annotations.Test;

public class Parallel_Chrome
{
		@Test
		public void launch()
		{
			System.out.println("Launch chrome");
		}
		@Test
		public void login()
		{
			System.out.println("Login-chrome");
		}
		@Test
		public void details()
		{
			System.out.println("details-chrome");
		}
		@Test
		public void logout()
		{
			System.out.println("Logout-chrome");
		}
}
