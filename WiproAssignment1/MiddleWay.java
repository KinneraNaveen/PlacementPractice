package WiproAssignment1;
 import java.util.Arrays;
public class MiddleWay {
    public static void main(String[] args) {
        int[][] aArrays = {
            {1, 2, 3},
            {7, 7, 7},
            {5, 2, 9}
        };

        int[][] bArrays = {
            {4, 5, 6},
            {3, 8, 0},
            {1, 4, 5}
        };

        for (int i = 0; i < aArrays.length; i++) {
            int[] result = middleWay(aArrays[i], bArrays[i]);
            System.out.println("Array a: " + Arrays.toString(aArrays[i]));
            System.out.println("Array b: " + Arrays.toString(bArrays[i]));
            System.out.println("Middle elements: " + Arrays.toString(result));
            System.out.println();
        }
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
