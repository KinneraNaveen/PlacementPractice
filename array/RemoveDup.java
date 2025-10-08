package array;
import java.util.*;
public class RemoveDup {
    public static int []Dup(int arr[]){
         HashSet<Integer>set=new HashSet();
          for(int n:arr){
            set.add(n);
          }

          int res[]=new int[set.size()];
          int i=0;
          for(int num:set){

            res[i++]=num;
          }
          return res;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,2,1,6,54};
        int res[]=  Dup(arr);
        for(int n:res){
            System.out.print(n+" ");
        }     
    } 
}


// public static int[] Dup(int arr[]) {
//     int n = arr.length;
//     if (n == 0) return new int[0];

//     int i = 0;

//     for (int j = 1; j < n; j++) {
//         if (arr[i] != arr[j]) {
//             i++;
//             arr[i] = arr[j];
//         }
//     }

//     int[] nums = new int[i + 1];
//     for (int k = 0; k <= i; k++) {
//         nums[k] = arr[k];
//     }

//     return nums;
// }
