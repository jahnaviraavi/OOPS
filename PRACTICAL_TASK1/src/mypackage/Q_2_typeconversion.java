package mypackage;

public class Q_2_typeconversion {
    public static void main(String[] args) {
        // Implicit
        int num = 10;
        double result = num;
        System.out.println("Implicit conversion (int to double): " + result);

        // Explicit
        double d = 9.8;
        int i = (int) d;
        System.out.println("Explicit conversion (double to int): " + i);
    }
}
