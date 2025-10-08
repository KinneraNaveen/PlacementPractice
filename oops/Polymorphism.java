package oops;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));        // calls int add(int, int)
        System.out.println(calc.add(5.5, 10.5));    // calls double add(double, double)
        System.out.println(calc.add(1, 2, 3));      // calls int add(int, int, int)
    }
}





// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Polymorphism {
//     public static void main(String[] args) {
//         Animal a1 = new Dog();  // Runtime Polymorphism
//         Animal a2 = new Cat();

//         a1.sound(); // calls Dog's sound()
//         a2.sound(); // calls Cat's sound()
//     }
// }
