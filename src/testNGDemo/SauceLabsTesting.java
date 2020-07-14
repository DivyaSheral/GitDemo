package testNGDemo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SauceLabsTesting {
	
	  public static final String USERNAME = "DivyaSheral";
	  public static final String ACCESS_KEY = "74b2983e-75eb-4334-9b9a-be8212dc75fe";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
	  DesiredCapabilities capabalities;
	 
	@Test
	public void crossBrowserTesting_RS() throws MalformedURLException
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setCapability("name", "CrossBrowserDemo");
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "59.0");		
		WebDriver driver= new RemoteWebDriver(new URL(URL),caps);
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		driver.close();		
	}
	  
	
	/*public void crossBrowserTesting() throws MalformedURLException
	 {
		 	capabalities = new DesiredCapabilities();
			capabalities.setCapability("name", "CrossBrowserDemo");
			capabalities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			capabalities.setCapability(CapabilityType.BROWSER_VERSION, "83.0");
			capabalities.setCapability(CapabilityType.PLATFORM, "Windows 10");
			//capabalities.setCapability("screen-resolution", myprop.readValues("ScreenResolution"));
			capabalities.setCapability("accesskey", ACCESS_KEY);
			capabalities.setCapability("username", USERNAME);
					
			WebDriver driver = new RemoteWebDriver(new URL(URL),capabalities);
	 }*/
	

}
