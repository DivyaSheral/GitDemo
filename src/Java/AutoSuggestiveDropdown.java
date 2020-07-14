package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdown {
	WebDriver driver;

	public void driverSetup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void ksrtc()
	{	
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.cssSelector("input#fromPlaceName")).sendKeys("Ben");
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;  //to access hidden elements
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String value = (String) js.executeScript(script);
		
		int cnt=0;
		while(!value.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{		
			cnt++;
			System.out.println(value);
			action.sendKeys(driver.findElement(By.cssSelector("input#fromPlaceName")),Keys.DOWN).build().perform();
			script = "return document.getElementById(\"fromPlaceName\").value;";
			value = (String) js.executeScript(script);
			if(cnt>5)
			{
				break;
			}
		}
		
		if(cnt>5)
		{
			System.out.println("Element not found");
		}
		else
		{
			action.sendKeys(driver.findElement(By.cssSelector("input#fromPlaceName")), Keys.ENTER).build().perform();
		
		}
		
		//driver.close();

		
	}

	public static void main(String[] args) 
	{
		AutoSuggestiveDropdown a = new AutoSuggestiveDropdown();
		a.driverSetup();
		a.ksrtc();

	}

}
