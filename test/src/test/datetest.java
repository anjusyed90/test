package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class datetest {
	public static void main(String[] args) {
		
		final ZonedDateTime input = ZonedDateTime.now();
		LocalDate date=input.toLocalDate();
		System.out.println(date);
		final ZonedDateTime startOfLastWeek = input.minusWeeks(1).with(DayOfWeek.MONDAY);
		System.out.println(startOfLastWeek);
		final ZonedDateTime endOfLastWeek = startOfLastWeek.plusDays(6);
		System.out.println(endOfLastWeek);
		
		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("YYYY-MM-DD");
		String inputdate=date.toString();
		System.out.println(inputdate);

	}

}
