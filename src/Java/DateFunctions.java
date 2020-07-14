package Java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {
	

	public static void main(String args[])
	{
		Date d = new Date();
		String 
		currentDate = d.toString(); //convert into string
		System.out.println("Curret Date : "+currentDate);
		
		SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedDate = myformat.format(d);
		System.out.println("formatted Date : "+formattedDate);
		//System.out.println();
	}
}
