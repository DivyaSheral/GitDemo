package testNGDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatabaseTesting
{
	String loc;
	String name;
	
	@Test
	public void jdbcConnection() throws SQLException, ClassNotFoundException
	{
		String host= "localhost";
		String port = "3306";
		String database = "QAdbt";;	
		
		//url syntax = "jdbc:mysql://localhost:3306/QAdbt"
		Class.forName("com.mysql.cj.jdbc.Driver"); //loading the driver
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+database , "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select Name , Location from EmployeeInfo");
		while(rs.next())//move from base index to first index
		{
			name = rs.getString("Name");
			loc =rs.getString("Location");
			System.out.println("Name = "+name);
			System.out.println("Location = "+loc);
		}
		con.close();
	
	}
	
	//@Test(dependsOnMethods="jdbcConnection")
	public void SalesForceTestCases()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\jarFiles\\chromedriver_83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(loc);
	}

}
