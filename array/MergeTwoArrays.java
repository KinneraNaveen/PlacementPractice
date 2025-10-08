package array;
import java.util.*;
public class MergeTwoArrays {
    public static void main(String[]args){
        int arr1[]={5,2,3,7};
        int arr2[]={8,2,9,10};
        HashSet<Integer> set = new HashSet<>(); // TreeSet auto-sorts and removes duplicates

       for (int n : arr1) set.add(n);
       for (int n : arr2) set.add(n);

       System.out.println("Merged without duplicates:");
       for (int n : set) {
       System.out.print(n + " ");
}

        // int res[]=new int[arr1.length+arr2.length];
        // for(int i=0;i<arr1.length;i++){
        //     res[i]=arr1[i];
        // }
        // for(int i=0;i<arr2.length;i++){
        //     res[arr1.length+i]=arr2[i];
        // }

        // Arrays.sort(res);

        // for(int n:res){
        //     System.out.print(n+" ");
        // }
    } 
}
