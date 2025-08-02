package mypackage;

public class Q_1_Typeconversion {
    public static void main(String[] args) {
        // String to int (Type conversion)
        String str = "100";
        int num = Integer.parseInt(str);
        System.out.println("String to int: " + num);

        // int to double using wrapper class
        Integer intObj = 42;
        double d = intObj.doubleValue(); // conversion using wrapper
        System.out.println("int to double using wrapper: " + d);
    }
}