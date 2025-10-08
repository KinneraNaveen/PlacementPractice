package WiproAssignment1;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 1 || age > 100) {
            System.out.println("Invalid age. Age must be between 1 and 100.");
            sc.close();
            return;
        }

        double interest = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age <= 58) {
                interest = 8.2;
            } else {
                interest = 9.2;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age <= 58) {
                interest = 8.4;
            } else {
                interest = 10.5;
            }
        } else {
            System.out.println("Invalid gender. Please enter 'Male' or 'Female'.");
            sc.close();
            return;
        }

        System.out.println("Gender: " + gender + ", Age: " + age + " → Interest: " + interest + "%");
        sc.close();
    }
}
