package oops;
public class Mutilevel {
public static void main(String[]args){
    C ob=new C();
    ob.b();
    ob.decent();
    ob.c();
}
    
}
class A{

    void decent(){
        System.out.println("GATE");
    }

}
class B extends A {
    void b(){
        System.out.println("method For B");

    }

}
class C extends B{
    void c(){
        System.out.println("method For c");
        
    }

}
