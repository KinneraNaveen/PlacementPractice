package array;
import java.util.*;
public class Gcd {
    public static void main(String[]args){
        int a=10;
        int b=5;
        while(b!=0){
           int temp=b;
            b=a%b;    
            a=temp;
        }
        
        System.out.println(a);
        // int n=2;
        //  int total=n*(n+1)/2;
        // System.out.print(total);

    }
    
}
