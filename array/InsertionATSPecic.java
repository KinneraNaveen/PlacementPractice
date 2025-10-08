 package array;

public class InsertionATSPecic {
    public static void main(String[] args) {
        int[] arr = new int[6];  // total capacity = 6
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        int val = 8;
        int ind = 2;
        int n = 5;  

        if (n >= arr.length) {
            System.out.println("Array is full. Insertion not possible.");
            return;
        }  
        for (int i = n; i > ind; i--) {
            arr[i] = arr[i - 1];
        }
        arr[ind] = val;
        n++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
