package mypackage;
import java.time.*;

public class Q_4_period {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.now();

        Period period = Period.between(start, end);
        System.out.println("Difference: " + period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");

	}

}
