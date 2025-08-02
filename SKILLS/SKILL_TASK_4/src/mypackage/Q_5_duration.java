package mypackage;
import java.time.*;

public class Q_5_duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(12, 30);

        Duration duration = Duration.between(start, end);
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());

	}

}
