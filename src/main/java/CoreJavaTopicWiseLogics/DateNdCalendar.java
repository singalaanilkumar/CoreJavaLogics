package CoreJavaTopicWiseLogics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateNdCalendar {

	public static void main(String[] args) {
		/*Date d= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sd= new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d)); */
		
		Calendar c=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/M/yyy hh:ss:mm");

		   System.out.println(sdf.format(c.getTime()));

		   System.out.println(c.get(Calendar.DAY_OF_MONTH));;

		   System.out.println(c.get(Calendar.DAY_OF_YEAR));

		   System.out.println(c.get(Calendar.HOUR));
		
		
		
		

	}

}
