package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {
	
	WebDriver driver;
	

	public void driverSetup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void demo()
	{
		driver .get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//span[@class='nav-line-2 ' and text()='Account & Lists']"));
		WebElement target2 =driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		//a.moveToElement(target).build().perform(); //mouseover
		
		//a.moveToElement(target2).click().keyDown(Keys.SHIFT).sendKeys("fan") //shiftkey and doubleclick for select
		//								.doubleClick().build().perform();
		
		//a.clickAndHold(driver.findElement(By.xpath("//a[contains(@href,'bestsellers') and text()='Best Sellers']")))
		//								.build().perform(); //click and hold
		
		a.moveByOffset(100, 200).contextClick().build().perform();
		
							
	}
	
		
	public static void main(String[] args) {
		
		ActionsClassDemo a = new ActionsClassDemo();
		a.driverSetup();
		a.demo();
		

	}

}
