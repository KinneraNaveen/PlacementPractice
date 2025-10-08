package String;
 import java.util.Scanner;
public class RemoveFirstLast{
    static String removeFirstLast(String str) {
        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Output: " + removeFirstLast(input));
        sc.close();
    }
}

