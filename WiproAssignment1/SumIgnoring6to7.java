package WiproAssignment1;
public class SumIgnoring6to7 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean ignore = false;
        for (int num : numbers) {
            if (num == 6) {
                ignore = true;
                continue;
            }
            if (ignore && num == 7) {
                ignore = false;
                continue;
            }
            if (!ignore) {
                sum += num;
            }
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

