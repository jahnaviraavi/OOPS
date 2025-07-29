package mypackage;
import java.time.*;

public class Q_1_Local_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 5, 20);

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);

        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Last week: " + today.minusWeeks(1));

        System.out.println("Month: " + today.getMonth());
        System.out.println("Day of week: " + today.getDayOfWeek());
		

	}

}
