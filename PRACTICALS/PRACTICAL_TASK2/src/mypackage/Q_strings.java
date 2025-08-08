package mypackage;

public class Q_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println("s1 == s2 : " +(s1==s2));
		System.out.println("s1 == s3 : " +(s1==s3));
		System.out.println("s1.equals(s3)" +s1.equals(s3));
		
		System.out.println("String Manipulation: ");
		
		String str = "Java programming";
		
		System.out.println("Original: " + str);
		System.out.println("Upper case: " + str.toUpperCase());
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Sub string (0,4): " + str.substring(0,4));
		System.out.println("Replace: " +str.replace("Java","C++"));
		System.out.println("Length:" + str.length());
		System.out.println("char at 5: " + str.charAt(5));
		
		System.out.println("String immutability");
		String s = "Hello";
		System.out.println("Original: " + s);
		s = s.concat("World");
		System.out.println("After concat: " + s);
		
		System.out.println("StringBuilder & StringBuffe");
		
		StringBuilder sb = new StringBuilder("Hello");
		
		 sb.append(" World");
	        System.out.println("StringBuilder append: " + sb);

	        sb.reverse();
	        System.out.println("StringBuilder reverse: " + sb);

	        StringBuffer sbf = new StringBuffer("Java");
	        sbf.insert(4, " Programming");
	        System.out.println("StringBuffer insert: " + sbf);

	        sbf.delete(4, 16);
	        System.out.println("StringBuffer delete: " + sbf);
		
		
		
		

	}

}
