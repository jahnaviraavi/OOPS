package mypackage;

class Car {
	String Brand;
	int year;
	void displayinfo()
	{
		System.out.println("Brand: " + Brand + ", Year: " + year);
	}
	
}

public class Q_1_Class_and_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.Brand="Honda";
		car1.year=2022;
		
		Car car2 = new Car();
		car2.Brand="Toyota";
		car2.year=2025;
		
		car1.displayinfo();
		car2.displayinfo();
	
	}

}
