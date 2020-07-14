package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderFunctions {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		System.out.println("Current Date " +sdf.format(cal.getTime()));
		System.out.println("getMinimalDaysInFirstWeek " +cal.getMinimalDaysInFirstWeek());
		System.out.println("getTimeInMillis " +cal.getTimeInMillis());
		System.out.println("getWeekYear " +cal.getWeekYear());
		System.out.println("getTimeZone " +cal.getTimeZone());
		System.out.println("AM_PM " +Calendar.AM_PM);
		System.out.println("DAY_OF_MONTH " +Calendar.DAY_OF_MONTH);
		System.out.println("DAY_OF_WEEK " +Calendar.DAY_OF_WEEK);
		System.out.println("HOUR_OF_DAY " +Calendar.HOUR_OF_DAY);
		

	}

}
