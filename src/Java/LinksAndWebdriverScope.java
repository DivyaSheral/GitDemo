package Java;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndWebdriverScope {

	WebDriver driver;

	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void links() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int totallinks = driver.findElements(By.tagName("a")).size();
		System.out.println("All Links :" + totallinks);

		/// first way to get footer links
		int footerLinks = driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']//a"))
				.size();
		System.out.println("Footer Links :" + footerLinks);

		/// second method - limiting the scope of driver
		WebElement footerDriver = driver
				.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
		int fooLinks = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Footer Links :" + fooLinks);

		// first method of getting only first column links of footer
		int firstColumnLinks = driver.findElements(By.xpath("//div[@id='gf-BIG']//tr//td[1]//a")).size();
		System.out.println("First Column Links :" + firstColumnLinks);

		// second method of getting only first column links of footer -limiting the
		// scope of driver
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println("First Column Links :" + columnDriver.findElements(By.tagName("a")).size());

		//// code for opening multiple links in different tabs//////
		List<WebElement> allElements = columnDriver.findElements(By.tagName("a"));

		for (int i = 1; i < allElements.size(); i++) {
			String keysclick = Keys.chord(Keys.CONTROL, Keys.ENTER); // multiple keyboard keys can be handled using
																		// chord method
			allElements.get(i).sendKeys(keysclick);
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

	public void qAClickNavigateBack()	{
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int c = footerDriver.findElements(By.tagName("a")).size();

		for(int i = 1;i<c;i++)
		{
			driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul")).findElements(By.tagName("a"))
					.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
	}

	

	public void goToLinksAndNavigateBack() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> footerDriverlinks = driver
				.findElements(By.xpath("//div[@id='gf-BIG']//tr//td[1]//a"));
		System.out.println("First Column Links :" +footerDriverlinks.size());

		for (int i = 1; i < footerDriverlinks.size(); i++) 
		{
			driver.findElements(By.xpath("//div[@id='gf-BIG']//tr//td[1]//a")).get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
	}

	public static void main(String[] args) {
		LinksAndWebdriverScope a = new LinksAndWebdriverScope();
		a.driverSetup();
		// a.links();
		a.goToLinksAndNavigateBack();
		//a.qAClickNavigateBack();
		

	}

}
