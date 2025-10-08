package String;
import java.util.*;
public class PrintTwice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        StringBuilder res=new StringBuilder();

 for(int i=0;i<s.length();i++){
    char c=s.charAt(i);

    res.append(c).append(c);
 }
 System.out.println(res.toString());
    }
    
}
