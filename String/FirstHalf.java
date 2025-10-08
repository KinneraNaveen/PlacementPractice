package String;
import java.util.Scanner;
public class FirstHalf {
    static String firstHalf(String str) {
        if (str.length() % 2 != 0) {
            return null;
        }
        String result = "";
        for (int i = 0; i < str.length() / 2; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Output: " + firstHalf(input));

        sc.close();
    }
}

 
