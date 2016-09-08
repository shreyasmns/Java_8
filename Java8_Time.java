package java_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * Illustartes the Date and Time Operations in Java 8
 * 
 */
public class Java8_Time {

	public static void main(String[] args) {
			
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
