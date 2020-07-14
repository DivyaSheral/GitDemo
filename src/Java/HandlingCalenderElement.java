package Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalenderElement {
	WebDriver driver;

	public void driverSetup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void selectMonthAndDate() throws InterruptedException
	{
		driver.get("https://www.path2usa.com/travel-companions");
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@src=\"https://www.path2usa.com/responsive_filemanager/source/CA-Gold-Travel-Insurance_1680x655.jpg\"]")));
		
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		
		while(!month.getText().contains("December"))
		{
			driver.findElement(By.cssSelector("th.next")).click();
		}
		
		
		List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));
		for(int i =0;i<days.size();i++)
		{
			if(driver.findElements(By.xpath("//td[@class='day']")).get(i).getText().contains("14"))
			{
				days.get(i).click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		HandlingCalenderElement h = new HandlingCalenderElement();
		h.driverSetup();
		h.selectMonthAndDate();
	}

}
