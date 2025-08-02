package mypackage;
import java.util.Scanner;

public class Q_2_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter rows and columns: ");
	        int r = sc.nextInt();
	        int c = sc.nextInt();
	        int arr[][] = new int[r][c];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	                arr[i][j] = sc.nextInt();
	            }
	        }

	      
	        System.out.println("2D Array:");
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	        
	        int sum = 0;
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	                sum += arr[i][j];
	            }
	        }
	        System.out.println("Sum of elements = " + sum);
	        
	        sc.close();

	}

}
