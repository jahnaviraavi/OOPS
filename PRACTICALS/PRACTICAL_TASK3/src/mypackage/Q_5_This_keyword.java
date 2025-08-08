package mypackage;

class Student1 {
    String name; 

    Student1(String name) {
        this.name = name; 
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Q_5_This_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student1 s = new Student1("Jahnavi");
	        s.display(); 
	    }

	}


