package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
	
	WebDriver driver ;
	public void driverSetup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	public void frameSwitchDragAndDrop()
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frameWebelement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameWebelement);
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement destination = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source , destination).build().perform();
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		FramesDemo f = new FramesDemo();
		f.driverSetup();
		f.frameSwitchDragAndDrop();

	}

}
