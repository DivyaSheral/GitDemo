package Java;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignments {

	WebDriver driver;
	WebDriverWait wait;

	public void driverSetup() {

		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait = new WebDriverWait(driver, 5);
	}
	
	public void Assignment6() throws InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown = driver.findElement(By.id("autocomplete"));
		dropdown.sendKeys("uni");
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String value = (String) js.executeScript(script);
		int cnt=0;
		while(!value.equalsIgnoreCase("United States (USA)"))
		{
			cnt++;
			dropdown.sendKeys(Keys.ARROW_DOWN);
			value = (String) js.executeScript(script);
			if(cnt>15)
			{
				System.out.println("Element not found");
				break;
			}
		}
		
		if(cnt<=15)
		{
			System.out.println(value);
			dropdown.sendKeys(Keys.ENTER);		
		}
		
		
		
		
	}

public void Assignment5() {

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("Number of Rows : " + rows.size()); // Number of rows
		for (int i = 1; i < rows.size(); i++) {
			if (rows.get(i).getText().contains("Learn SQL in Practical + Database Testing from Scratch"))
			{
				List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
				System.out.println("Number of Colummns :" + columns.size()); // Number of columns
				System.out.print(columns.get(0).getText() + " - ");
				System.out.print(columns.get(1).getText() + " - ");
				System.out.print(columns.get(2).getText());
			}
		}

	}

	
	public void assignment4() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href=\"/nested_frames\"]")).click();
		driver.switchTo().frame("frame-top"); // selecting frame by its "name"
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']"))); // selecting frame by
																								// webElement
		String text = driver.findElement(By.id("content")).getText();
		System.out.println("Text:" + text);
	}

	public void assignment3() {
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

	}

	public void assignment2() {
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		// Assert.assertEquals("Process completed! This response has been loaded via the
		// Ajax request directly from the web server, without reoading this page.",
		// driver.findElement(By.xpath("//div[@id='results']")).getText());

	}

	public void assignment1() throws InterruptedException {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox = driver.findElement(By.cssSelector("input#checkBoxOption1"));

		Assert.assertFalse(checkbox.isSelected());

		checkbox.click();
		Thread.sleep(2000);
		Assert.assertTrue(checkbox.isSelected());

		checkbox.click();
		Thread.sleep(2000);
		Assert.assertFalse(checkbox.isSelected());

		System.out.println("size = " + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

	public static void main(String[] args) throws InterruptedException {
		Assignments a = new Assignments();
		a.driverSetup();
		// a.assignment2();
		// a.assignment3();
		// a.assignment4();
		a.Assignment6();
		
	}
}
