package Java;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridDemo {
	
	public void gridRemote() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.100.13:4444/wd/hub"),dc);
		driver.get("https://www.selenium.dev/downloads/");
	}

	public static void main(String[] args) throws MalformedURLException {
		gridDemo g = new gridDemo();
		g.gridRemote();

	}

}
