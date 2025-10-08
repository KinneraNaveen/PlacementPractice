package oops;

//
abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Animal  is sleeping ");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}
public class Abstraction {
     public static void main(String[]args){
        Animal c=new Dog();
        Dog d= new Dog();
        d.sound();
        d.sleep();
     }
 
    
}
