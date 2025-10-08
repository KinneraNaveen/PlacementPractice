package WiproAssignment1;
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        System.out.println("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of array: " + sum);
        System.out.println("Average of array: " + average);
    }
}

