package mypackage;

public class Q_3_operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		System.out.println("Arithmetic Operators:");
		System.out.println("a + b = " + (a + b));   
		System.out.println("a - b = " + (a - b));   
		System.out.println("a * b = " + (a * b));   
		System.out.println("a / b = " + (a / b));   
		System.out.println("a % b = " + (a % b));  


		System.out.println("\nRelational Operators:");
		System.out.println("a == b: " + (a == b));   
		System.out.println("a != b: " + (a != b));   
		System.out.println("a > b: " + (a > b));     
		System.out.println("a < b: " + (a < b));     
		System.out.println("a >= b: " + (a >= b));   
		System.out.println("a <= b: " + (a <= b));  

		// Logical Operators
		boolean x = true;
		boolean y = false;

		System.out.println("\nLogical Operators:");
		System.out.println("x && y: " + (x && y));   
		System.out.println("x || y: " + (x || y));   
		System.out.println("!x: " + (!x));         

		// Assignment Operators
		int c = 20;
		System.out.println("\nAssignment Operators:");
		System.out.println("c = " + c);
		c += 5; // c = c + 5
		System.out.println("c += 5: " + c);
		c -= 3; // c = c - 3
		System.out.println("c -= 3: " + c);
		c *= 2; // c = c * 2
		System.out.println("c *= 2: " + c);
		c /= 4; // c = c / 4
		System.out.println("c /= 4: " + c);
		c %= 3; // c = c % 3
		System.out.println("c %= 3: " + c);

		// Unary Operators
		int d = 7;
		System.out.println("\nUnary Operators:");
		System.out.println("d = " + d);
		System.out.println("++d = " + (++d)); 
		System.out.println("d++ = " + (d++));  
		System.out.println("--d = " + (--d));  
		System.out.println("d-- = " + (d--)); 
		System.out.println("Final d = " + d);

		// Bitwise Operators
		int e = 6;  // 0110
		int f = 3;  // 0011

		System.out.println("\nBitwise Operators:");
		System.out.println("e & f = " + (e & f));   
		System.out.println("e | f = " + (e | f));   
		System.out.println("e ^ f = " + (e ^ f));   
		System.out.println("~e = " + (~e));          
		System.out.println("e << 1 = " + (e << 1));
		System.out.println("e >> 1 = " + (e >> 1)); 
	}
}
