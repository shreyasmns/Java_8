package java_8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Java8_Time {

	public static void main(String[] args) {
			
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		Month month = currentDateTime.toLocalDate().getMonth();
		DayOfWeek week = currentDateTime.toLocalDate().getDayOfWeek();
		int day = currentDateTime.toLocalDate().getDayOfMonth();
		int secs = currentDateTime.toLocalTime().getSecond();
		System.out.println("Month : "+month + ", Day of week : "+week + ", Day : "+day+ ", seconds : "+secs);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("\nLocal Date and Time : "+datetime);
		
		LocalDate date = LocalDate.of(2016, Month.SEPTEMBER, 8);
		System.out.println("\nToday's Date : "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("\nLocal Time right Now : "+time);
		
		LocalDateTime minDateTime = LocalDateTime.MIN;
		System.out.println("\nTime starts from : "+minDateTime);
		
		LocalDateTime maxDateTime = LocalDateTime.MAX;
		System.out.println("\nMax Date Time Possible : "+maxDateTime);
		
	}

}
