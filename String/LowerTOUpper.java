package String;
import java.util.*;
public class LowerTOUpper {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&& ch<='Z'||ch>='a'&&ch <='z'){
                System.out.print((char)(ch^32));


            }
        }

    }
    
}
