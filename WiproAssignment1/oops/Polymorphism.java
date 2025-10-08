package WiproAssignment1.oops;

class Fruit {
    String name;
    String taste;
    String size;

    void eat() {
        System.out.println("This fruit is " + name + " and it tastes " + taste + ".");
    }
}
class Apple extends Fruit {
    Apple() {
        name = "Apple";
        taste = "sweet";
        size = "medium";
    }

    void eat() {
        System.out.println("The " + name + " tastes " + taste + " and is " + size + " in size.");
    }
}

class Orange extends Fruit {
    Orange() {
        name = "Orange";
        taste = "sour";
        size = "medium";
    }

    void eat() {
        System.out.println("The " + name + " tastes " + taste + " and is " + size + " in size.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.name = "Generic Fruit";
        f.taste = "varied";
        f.size = "different sizes";
        f.eat();

        Apple a = new Apple();
        a.eat();

        Orange o = new Orange();
        o.eat();
    }
}
