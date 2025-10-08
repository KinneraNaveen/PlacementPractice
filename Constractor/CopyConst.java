package Constractor;

 class Student {
    int id;
    String name;

    // Normal Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class  CopyConst{
    public static void main(String[] args) {
        Student s1 = new Student(101, "Naveen");   // Original object
        Student s2 = new Student(s1);              // Copy using constructor

        s1.display();  // ID: 101, Name: Naveen
        s2.display();  // ID: 101, Name: Naveen
    }
}

