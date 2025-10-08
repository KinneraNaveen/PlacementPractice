package oops;

public class Inheritance {
    public static void main(String[]args){
        Child c=new Child();
        c.miage();
        c.drive();
    }   
}
class Parent  {
    void drive(){
        System.out.println("Driving the car");
    }
}
class Child extends Parent{

    void miage(){
        System.out.println("Milage is 20km/hr");
    }

}

