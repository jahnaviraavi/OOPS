package mypackage;

class Car2 {
    String brand;
    int year;
    
    Car2() {
        brand = "Unknown";
        year = 0;
    }
    
    
    Car2(String b, int y) {
        brand = b;
        year = y;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
public class Q_4_overloading_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car2 c1 = new Car2();              
	        Car2 c2 = new Car2("Hyundai", 2021); 
	        
	        c1.displayInfo(); 
	        c2.displayInfo(); 

	}

}
