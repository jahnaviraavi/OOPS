package mypackage;
import java.time.*;

public class Q_3_Local_date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime now = LocalDateTime.now();
	        System.out.println("Current DateTime: " + now);

	        LocalDateTime meeting = LocalDateTime.of(2025, 7, 29, 10, 30);
	        System.out.println("Meeting DateTime: " + meeting);

	}

}
