package oops;

//Method overriding allows runtime polymorphism
//the method that gets called depends on the actual object type


class Parent{
    public void foddy(){
        System.out.println(" parent moody");
    }
}
class Child extends Parent{
    @Override
    public void foddy(){

        System.out.println("child is foddy");
    }
}
public class Overriding {
    public static void main(String[]args){
    Child c=new Child();
    c.foddy();
    
    }   
}
