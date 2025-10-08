package WiproAssignment1;

import java.util.Scanner;

public class  DivArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.println("Enter 4 integers for a 2x2 array:");
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        int[][] array = {
            {numbers[0], numbers[1]},
            {numbers[2], numbers[3]}
        };

        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] reversed = {
            {numbers[3], numbers[2]},
            {numbers[1], numbers[0]}
        };

        System.out.println("The reverse of the array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(reversed[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
