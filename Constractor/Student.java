package Constractor;
import java.util.*;
class Studen {
    String name;
    int age;

    // No-arg constructor (user-defined)
    Studen() {
        name = "Naveen";
        age = 22;
    }
}

public class Student {
    public static void main(String[] args) {
        Studen s = new Studen(); // calls our constructor
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}
