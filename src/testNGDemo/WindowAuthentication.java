package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowAuthentication
{
	WebDriver driver;
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
	}

}
