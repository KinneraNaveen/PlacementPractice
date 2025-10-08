package oops;
//polymorphism (compile time )
//Method overloading is a feature in Java where two or more methods in the same class have the same name but different parameter

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class OverLoading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of doubles: " + calc.add(5.5, 10.5));
    }
}
