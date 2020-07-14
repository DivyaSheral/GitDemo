package Java;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShots {

	WebDriver driver;
	public void screenShotDemo()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://novoresume.com/");
		
		//driver object is casted to type TakesScreenshot 
		//the output is of type FILE
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//copy file to our local machine 
		try {
			FileUtils.copyFile(src, new File("D:\\Screenshots\\image.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		ScreenShots s = new ScreenShots();
		s.screenShotDemo();
	}

}
