package mypackage;

import java.time.*;

public class Q_2_Local_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
        LocalTime specificTime = LocalTime.of(14, 30, 15);

        System.out.println("Current Time: " + now);
        System.out.println("Specific Time: " + specificTime);

        System.out.println("After 2 hours: " + now.plusHours(2));
        System.out.println("Before 15 minutes: " + now.minusMinutes(15));

	}

}
