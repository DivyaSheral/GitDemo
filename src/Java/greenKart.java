package Java;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class greenKart {
	WebDriver driver;
	WebDriverWait wait;

	public void driverSetup() {

		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_win321\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //implicit wait
		 wait = new WebDriverWait(driver,5); //explicitwait
		
	}

/////////////////////////////////////////////////////////////////////////////////////////////
	
	public void goKartRahulShettyCode() {
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@src='./images/bag.png']")).click();
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		Assert.assertEquals("Code applied ..!", driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
	}

	public void addItems(WebDriver driver, String[] itemsNeeded)

	{
		// format it to get actual vegetable name
		// convert array into array list for easy search
		// check whether name you extracted is present in arrayList or not-

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}

	}

///////////////////////////////////////////////////////////////////////////////////////

	public void goKartGeneralised() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] veggiesToAdd = { "Cauliflower", "Beetroot", "Beans", "Tomato" };
		List<WebElement> allVeggies = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int k = 0;
		for (String s : veggiesToAdd) {
			for (int i = 0; i < allVeggies.size(); i++) {
				if (allVeggies.get(i).getText().contains(s)) {
					k++;
					driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
					if (k == veggiesToAdd.length)
						break;
				}
			}
		}
	}
////////////////////////////////////////////////////////////////////////////////////

	/// gokart app using search and adding item
	public void shopp() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// driver.findElement(By.xpath("//h4[contains(text(),'Cucumber')]//following-sibling::div[2]//child::button[text()='ADD
		// TO CART']")).click();

		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Beetroot");
		driver.findElement(By.cssSelector("button.search-button")).click();
		String vegName = driver.findElement(By.cssSelector("h4.product-name")).getText();
		System.out.println(vegName);
		if (vegName.contains("Beetroot")) {
			driver.findElement(By.cssSelector("a.increment")).click();
			driver.findElement(By.xpath("//button[text()= 'ADD TO CART']")).click();
			String add = driver.findElement(By.cssSelector("button.added")).getText();
			System.out.println(add);
			if (add.contains("ADDED")) {
				System.out.println("passed");
				driver.findElement(By.xpath("//img[@src='./images/bag.png']")).click();
				driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
			}
		}

		else {
			System.out.println("Something Wrong");
		}

	}
	
	public void sorting()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//body//th[2]")).click();
		driver.findElement(By.xpath("//body//th[2]")).click();
		
		List<WebElement> rows = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0;i<rows.size();i++)
		{
			originalList.add(rows.get(i).getText());
			System.out.println(rows.get(i).getText());
		}
		System.out.println("*****************************8");
		ArrayList<String> copiedList = new ArrayList<String>(originalList);	
		Collections.sort(copiedList); //sorts in ascending order
		//Collections.reverse(copiedList);//sort in descending order
		for(String s:copiedList)
		{
			System.out.println(s);
		}
		Assert.assertEquals(copiedList,originalList);	
		
		
	}

/////////////////////////////////////////////////////////////////////////////////////////
	public void google() {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div[3]/input/title")).sendKeys("divya");
		
	}

////////////////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) throws InterruptedException {
		greenKart g = new greenKart();
		g.driverSetup();
		// g.shopp();
		// g.google();
		// g.goKartGeneralised();
		//g.goKartRahulShettyCode();
		g.sorting();
	}

}
