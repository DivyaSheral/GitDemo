package Java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	WebDriver driver ;
	public void driverSetup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	public void handlingMultipleWindows()
	{
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		System.out.println("Title:"+driver.getTitle());
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println("Title:"+driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println("Title:"+driver.getTitle());
		
	}

	public static void main(String[] args)
	{
		MultipleWindows m =new MultipleWindows();
		m.driverSetup();
		m.handlingMultipleWindows();
	}
}
