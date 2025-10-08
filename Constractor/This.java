package Constractor;

class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

}
public class This {
    public static void main(String[]args){
        Student s=new Student("Naveen",21);
        System.out.println(s.name);
        System.out.println(s.age);


    }
    
}
