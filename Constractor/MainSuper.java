package Constractor;

 class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    Student() {
        super();  // calls parent constructor
        System.out.println("Student constructor called");
    }
}

public class MainSuper {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
