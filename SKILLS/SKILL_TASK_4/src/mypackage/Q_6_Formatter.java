package mypackage;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q_6_Formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);

        System.out.println("Formatted DateTime: " + formattedDate);

	}

}
