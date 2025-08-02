package mypackage;

public class Q_1_String_manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Hello java ";
		String str = "Helo java";
		
		System.out.println("Length: " + s.length());
		
		System.out.println("Trim: " + "'" + s.trim() + "'");
		
		System.out.println("Lower: " + s.toLowerCase());
		
		System.out.println("Upper: " + s.toUpperCase());
		
		System.out.println("Substring from index 5: " + s.substring(5));
		
		System.out.println("Substring from index 5 to 9: " + s.substring(5,9));
		
		System.out.println("Contains java?: " + s.contains("java"));
		
		System.out.println("Replace e with a: " + s.replace('e', 'a'));
		
		System.out.println("Starts with 'Hello?': " + s.startsWith("Hello"));
		
		System.out.println("Ends with '?': " + s.endsWith("?"));
		
		System.out.println("Character at index 1: " + s.charAt(1));
		
		System.out.println("Index of j: " + s.indexOf("j"));
		
		System.out.println("Is Hello and Java equal?: " + s.equals("Hello java"));
		
		System.out.println("EqualsIgnoreCase ' helo, java '?: " + str.equalsIgnoreCase("Helo java"));

	}

}
