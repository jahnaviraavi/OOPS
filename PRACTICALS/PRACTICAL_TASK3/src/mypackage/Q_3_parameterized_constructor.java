package mypackage;

class Car1 {
    String brand;
    int year;

    Car1(String b, int y) {
        brand = b;
        year = y;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Q_3_parameterized_constructor {
    public static void main(String[] args) {
        Car1 c1 = new Car1("Toyota", 2020);
        Car1 c2 = new Car1("Honda", 2022);

        c1.displayInfo();
        c2.displayInfo();
    }
}
