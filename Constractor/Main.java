package Constractor;

class Student {
    String name;
    int age;

    Student() {
        name = "Naveen";
        age = 22;
    }
}

public class Main {   
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}

