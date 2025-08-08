package mypackage;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Q_2_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("lia", 19);
        Student s2 = new Student("mia", 20);

        s1.display();
        s2.display();

	}

}
