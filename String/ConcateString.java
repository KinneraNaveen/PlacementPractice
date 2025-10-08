package String;
import java.util.Scanner;
public class ConcateString{
    static String concatStrings(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return (str1.charAt(str1.length() - 1) == str2.charAt(0)) 
               ? str1 + str2.substring(1) 
               : str1 + str2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Concatenated result: " + concatStrings(s1, s2));

        sc.close();
    }
    }
