package Constractor;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Parametarized {
    public static void main(String[] args) {
        Student s1 = new Student("Naveen", 22);
        System.out.println(s1.name); // Naveen
        System.out.println(s1.age);  // 22
    }
}

