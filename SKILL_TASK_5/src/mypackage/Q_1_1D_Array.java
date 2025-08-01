package mypackage;
import java.util.Scanner;

public class Q_1_1D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n]; 
		
		System.out.println("Enter the element in the array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum: " + sum);
		
		int max = arr[0];
		
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element = " + max);
        sc.close();

	}

}
