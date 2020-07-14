package testNGDemo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpoadAndDownloadAutoIT {
	WebDriver driver;
	@Test
	public void demo() throws InterruptedException, IOException
	{		
		String downloadfilepath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_83\\chromedriver.exe");	
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadfilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		driver = new ChromeDriver(options);
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button.js-fileapi-wrapper.g-btn.g-btn--primary.g-btn--choose ")).click();
		Thread.sleep(3000);	
		Runtime.getRuntime().exec("D:\\AutoItCode\\FileUploadScript.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		driver.findElement(By.xpath("//div[@class=\"cookies-popup__inner\"]//button")).click();
		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Download Now']"))).click();
		
		Thread.sleep(5000);
		File file = new File(downloadfilepath+"/converted.jpg");
		if(file.exists())
		{
			Assert.assertTrue(file.exists());
			System.out.println("File Found");
		}
		
		if(file.delete())
		{
			System.out.println("File Deleted");
		}
			
		
	}

}
