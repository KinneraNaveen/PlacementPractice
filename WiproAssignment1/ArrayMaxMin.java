package WiproAssignment1;
public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] numbers = {25, 78, 12, 90, 45};
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
