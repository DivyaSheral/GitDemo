package Java;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBookingSitesPractice {
	
	WebDriver driver;

	public void driverSetup() {

		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void spiceJet() throws InterruptedException {
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		WebElement depart = driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT"));
		depart.click();
		depart.sendKeys("Delhi");

		WebElement arrival = driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT"));
		arrival.sendKeys("Mumbai");
		List<WebElement> dates = driver
				.findElements(By.xpath("//a[contains(@class,'ui-state-default')]//parent::td[@data-month='5']"));
		for (int i = 0; i < dates.size(); i++) {
			System.out.println(dates.get(i).getText());
			if (dates.get(i).getText().equals("23")) {
				dates.get(i).click();
				break;
			}
		}
		////// check if a element id enabled or disabled using get attributes//////
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if (driver.findElement(By.cssSelector("div#Div1")).getAttribute("style").contains("1"))
			System.out.println("Enabled");
		else
			System.out.println("Disabled");

	}
	public void spiceJetEndToEnd() throws InterruptedException {
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		WebElement depart = driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT"));
		depart.click();
		depart.sendKeys("Delhi");

		WebElement arrival = driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT"));
		arrival.sendKeys("Mumbai");

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Select adultdrop = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		adultdrop.selectByValue("3");

		Select childdrop = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		childdrop.selectByValue("1");

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();

		if (driver.findElement(By.cssSelector("div#Div1")).getAttribute("style").contains("1"))
			Assert.assertTrue(false);
		else
			Assert.assertTrue(true);

		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();

	}

	public void clearTrip() throws InterruptedException {
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Assert.assertTrue(driver.findElement(By.id("OneWay")).isSelected());
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"))
				.click();

		Select adultdrop = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		adultdrop.selectByValue("2");

		Select childdrop = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		childdrop.selectByValue("3");

		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Etihad");

		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

		String ErrMsg = driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText();
		Assert.assertEquals("Sorry, but we can't continue until you fix everything that's marked in RED", ErrMsg);

	}
	
	
	

	public void makemytrip() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys("Mum");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.xpath("//input[@id='fromCity']")).getAttribute("value"));

		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
		destination.sendKeys("BEN");
		Thread.sleep(2000);
		destination.sendKeys(Keys.DOWN);
		destination.sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.xpath("//input[@id='toCity']")).getAttribute("value"));

	}


	public static void main(String[] args) throws InterruptedException 
	{
		FlightBookingSitesPractice g = new FlightBookingSitesPractice();
		g.makemytrip();
		// g.assignment();
		// g.spiceJet();
		// g.spiceJetEndToEnd();
		// g.clearTrip();
	}

}
