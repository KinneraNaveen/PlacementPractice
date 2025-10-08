package String;
import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        } 
    }
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}



// int i = 0, j = str.length() - 1;
// while (i < j) {
//     if (str.charAt(i) != str.charAt(j)) {
//         isPal = false;
//         break;
//     }
//     i++;
//     j--;
// }
