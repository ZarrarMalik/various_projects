package dateExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date aDate = null;
		try {
			aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
			Calendar aCalendar = Calendar.getInstance();
			aCalendar.setTime(aDate);
			System.out.println(aCalendar.get(aCalendar.DAY_OF_MONTH)+ ","+aCalendar.get(aCalendar.MONTH));
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
			LocalDate bDate = LocalDate.parse("2012-01-15", formatter);
			System.out.println(" "+bDate.getDayOfMonth()+"," + bDate.getMonthValue());
		}catch (ParseException ex) {System.out.println("ParseException" + ex);
		}catch (DateTimeParseException ex) { System.out.println("DateTimeParseException " + ex);
		}
		
		
		
		
		
System.out.println(String.format("Local time: %tH:%tM:%tS", LocalTime.now(), LocalTime.now(), LocalTime.now()));
//System.out.println(String.format("Local time: %tT", Calendar.getInstance().toString()));;
System.out.println(String.format("Local time: %tT", Calendar.getInstance()));
System.out.println(String.format("Local time: %tT", LocalTime.now()));
//System.out.println(String.format("Local time: %1&tB", Calendar.getInstance()));


	}

}
