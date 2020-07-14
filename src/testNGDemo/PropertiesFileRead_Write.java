package testNGDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PropertiesFileRead_Write {
	
	Properties prop;
	@BeforeClass
	public void readProperty() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\JavaWorkspace\\RahulShettyTraining\\GlobalParameters.properties");
		prop.load(fis);//reading properties file
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.get("url"));
	}
	
	@Test
	public void writeProperty() throws IOException
	{
		prop.setProperty("Password", "divya123");//added new property
		prop.setProperty("Browser", "firefox");//updated existing
		FileOutputStream fos = new FileOutputStream("D:\\JavaWorkspace\\RahulShettyTraining\\GlobalParameters.properties");
		prop.store(fos, null); //writing in properties file
		System.out.println(prop.getProperty("Browser"));
	}
	

}
