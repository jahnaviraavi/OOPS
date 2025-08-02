package mypackage;

public class Q_2_Typecasting {
    public static void main(String[] args) {
        // Cast int to double
        int x = 25;
        double y = (double) x; // primitive casting
        System.out.println("int to double (primitive casting): " + y);

        // Cast Double wrapper to int using method
        Double dObj = 45.67;
        int z = dObj.intValue(); // casting using wrapper class
        System.out.println("Double to int using wrapper: " + z);
    }
}
