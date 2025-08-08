package mypackage;
import java.util.Scanner;

public class O_4_control_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		if(marks>=75)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		sc.close();

	}

}
