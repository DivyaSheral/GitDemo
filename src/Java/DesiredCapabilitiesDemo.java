package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	
	WebDriver driver;
	public void insecureAndSSLCeritificates()
	{
		DesiredCapabilities capabalities = DesiredCapabilities.chrome(); //creating object of chrome capabalities
		//setting customised browser settings
		capabalities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabalities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		//merging customised capabilities to the already present chrome options
		ChromeOptions options = new ChromeOptions();
		options.merge(capabalities);
		
		//adding the merged capabities to our browser
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver =  new ChromeDriver(options);
	}
	
	public void deleteCookies()
	{
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("vmuid");
		System.out.println("cookies deleted");
	}

	public static void main(String[] args) 
	{
		DesiredCapabilitiesDemo d = new DesiredCapabilitiesDemo();
		d.insecureAndSSLCeritificates();
		d.deleteCookies();

	}

}
