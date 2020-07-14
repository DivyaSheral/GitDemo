package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
	WebDriver driver;

	public void driverSetup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void tableExercise()
	{
		int sum=0;
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String value = columns.get(2).getText();
			int rates = Integer.parseInt(value);
			sum=sum+rates;	
		}
		System.out.println("Total :"+sum);
	}
	
	public void tableExcercise2()
	{
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		for(int i=1;i<rows.size();i++)
		{
			if(rows.get(i).getText().contains("Learn JMETER from Scratch - (Performance + Load) Testing Tool"))
			{
				
				List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
				System.out.print(columns.get(1).getText() + " - ");
				System.out.print(columns.get(2).getText());
			}
		}
		
	}
	

	public static void main(String[] args) {
		WebTables w =new WebTables();
		w.driverSetup();
		w.tableExcercise2();
	

	}

}
