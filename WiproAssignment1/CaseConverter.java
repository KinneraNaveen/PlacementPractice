package WiproAssignment1;
import java.util.Scanner;
public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            char upper = (char) (ch - 'a' + 'A');
            System.out.println(ch + " -> " + upper);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch - 'A' + 'a');
            System.out.println(ch + " -> " + lower);
        } else {
            System.out.println("The entered character is not an alphabet.");
        }

        sc.close();
    }
}
