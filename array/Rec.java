package array;

 public class Rec {
    public static void main(String[] args) {
        int n = 5;   // number of terms
        fib(n);      // call the method with n
    }

    public static void fib(int n) {
        int n1 = 0, n2 = 1;

        // print first two terms
        System.out.print(n1 + " " + n2);

        // print the rest
        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

