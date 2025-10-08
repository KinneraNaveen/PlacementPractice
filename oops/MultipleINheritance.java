package oops;
 
interface First {
    void method1();
}
 
interface Second {
    void method2();
}
 
class MultipleInheritanceDemo implements First, Second {
    public void method1() {
        System.out.println("Method 1 from First interface");
    }

    public void method2() {
        System.out.println("Method 2 from Second interface");
    }
}

public class MultipleINheritance{
    public static void main(String[] args) {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
        obj.method1();
        obj.method2();
    }
}
