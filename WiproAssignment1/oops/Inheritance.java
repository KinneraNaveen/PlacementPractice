package WiproAssignment1.oops;
 class Animal { 
    public void eat() { 
        System.out.println("Animal is eating..."); 
    } 
    public void sleep() { 
        System.out.println("Animal is sleeping..."); 
    } 
} 
class Bird extends Animal { 
    public void eat() { 
        System.out.println("Bird is pecking food..."); 
    } 
    public void sleep() { 
        System.out.println("Bird is sleeping in the nest..."); 
    } 
    public void fly() { 
        System.out.println("Bird is flying..."); 
    } 
} 

public class Inheritance { 
    public static void main(String[] args) { 
        Animal a = new Animal(); 
        System.out.println("Animal object calls:"); 
        a.eat(); 
        a.sleep(); 
        System.out.println(); 
        
        Bird b = new Bird(); 
        System.out.println("Bird object calls:"); 
        b.eat(); 
        b.sleep(); 
        b.fly(); 
    } 

}

