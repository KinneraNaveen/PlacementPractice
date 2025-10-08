package oops;

interface A {
    void showA();
}

interface B extends A {
    void showB();
}

class C {
    void showC() {
        System.out.println("Inside class C");
    }
}
 
class D extends C implements B {
    public void showA() {
        System.out.println("Inside interface A");
    }

    public void showB() {
        System.out.println("Inside interface B");
    }

    void showD() {
        System.out.println("Inside class D");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();  
        obj.showB();  
        obj.showC();  
        obj.showD(); 
    }
}



// interface Vehicle {
//     void start();
// }

// class Car {
//     void fuel() {
//         System.out.println("Car is fueled");
//     }
// }

// class ElectricCar extends Car implements Vehicle {
//     public void start() {
//         System.out.println("Electric Car started silently");
//     }
// }

// class SportsCar extends Car implements Vehicle {
//     public void start() {
//         System.out.println("Sports Car roars to start");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         ElectricCar ec = new ElectricCar();
//         SportsCar sc = new SportsCar();

//         ec.fuel();
//         ec.start();

//         sc.fuel();
//         sc.start();
//     }
// }
