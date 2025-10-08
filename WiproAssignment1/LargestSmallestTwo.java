package WiproAssignment1;
import java.util.Arrays;
public class LargestSmallestTwo {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = {25, 78, 12, 90, 45, 67};
        Arrays.sort(numbers);
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];
        int largest1 = numbers[numbers.length - 1];
        int largest2 = numbers[numbers.length - 2];
        System.out.println("Array elements: " + Arrays.toString(numbers));
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest2 + ", " + largest1);
    }
}
