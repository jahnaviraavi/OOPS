package mypackage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q_Date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate date = LocalDate.now();
	        System.out.println("Current Date: " + date);
	        
	        
	        LocalTime time = LocalTime.now();
	        System.out.println("Current Time: " + time);
	        
	        LocalDateTime dateTime = LocalDateTime.now();
	        System.out.println("Current Date and Time: " + dateTime);
	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        String formattedDateTime = dateTime.format(formatter);
	        System.out.println("Formatted Date and Time: " + formattedDateTime);
	        
	        String dateString = "03-08-2025 18:30:00";
	        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
	        System.out.println("Parsed Date and Time: " + parsedDateTime);

	}

}
