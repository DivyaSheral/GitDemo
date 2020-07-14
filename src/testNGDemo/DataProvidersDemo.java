package testNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvidersDemo {
	static int i=0;
	
	@DataProvider
	@Test
	public Object getData()
	{
		/*Object[][] data = new Object[3][2];
		data[0][0]="Divya";
		data[0][1]="Dasari";
		data[1][0]="Kiara";
		data[1][1]="Sheral";
		data[2][0]="Urmila";
		data[2][1]="Dasari";*/ //first method
		
		//second method 
		Object[][] data = {{"divya","dasari"},{"kiara","Sheral"},{"urmila","dasari"}};
		return data;		
	}
	
	@Test(dataProvider = "getData")
	public void loginDetails(String uname,String password)
	{
		System.out.println("Iteration: "+i++);
		System.out.println("Username = "+uname);
		System.out.println("Password = "+password);
	}

}
