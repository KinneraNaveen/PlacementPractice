package oops;
public class Hierarical{
    public static void main(String[]args){
        Son s=new Son();
        s.money();
        s.atti();
        Daughter d=new Daughter();
        d.money();
        d.desent();
    }
}

class Parent {
    void money(){
        System.out.println("Parent Money ");
    }

}
class Son extends Parent{
    void atti(){
        System.out.println("very Dangerious");

    }

}
class Daughter extends Parent{
    void desent(){
        System.out.println("Desent and soft ");
    }

}