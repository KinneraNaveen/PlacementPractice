package array;
import java.util.*;

public class RemDup {
    public static int[]rem(int[] arr){
        HashSet<Integer>h=new HashSet<>();
         for(int n:arr){
            h.add(n);
         }
         int a[]=new int[h.size()];
         int c=0;
         for(int num:h ){
            a[c++]=num;
         }
         return a;
           
    }
    public static void main(String[]args){
     int[] arr = {1, 2, 2, 3, 4, 4, 5};
     int [] ans=rem(arr);

     System.out.println("Array after removing duplicates: " + Arrays.toString(ans));
    }
    
}
