package Java;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	WebDriver driver;
	WebDriverWait wait;

	public void driverSetup()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,5);
	}
	
	public void WebdriverWaitDemo()
	{
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='finish'] h4")));
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}
	
	public void fluentWaitDemo()
	{
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		WebElement helloElement = driver.findElement(By.cssSelector("[id='finish'] h4"));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
																.ignoring(NoSuchElementException.class);
		
		 
	
		WebElement hello = wait.until(new Function<WebDriver, WebElement>()
		{
		     public WebElement apply(WebDriver driver)
		     {
		    	 if(helloElement.isDisplayed())
		    	 {	
		    		 return helloElement;
		    	 }
		    	 else
		    	 {
		    		 return null;
		    	 }
		     }
		});
		
		System.out.println("Result="+hello.getText());
	}
	

	public static void main(String[] args) {
		Synchronization s = new Synchronization();
		s.driverSetup();
		s.fluentWaitDemo();
		s.WebdriverWaitDemo();
	}

}
