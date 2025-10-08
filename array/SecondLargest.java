package array;
import java.util.*;
public class SecondLargest {
    public static void main(String[]args){

        int arr[]={1,5,4,7,7,3,2};
        // int first=Integer.MIN_VALUE;
        // int second=Integer.MIN_VALUE;
        // int third=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>first){
        //         third=second;
        //         second=first;
        //         first=arr[i];
        //     }
        //     else if(arr[i]>second &&arr[i]<first  ){

        //         third=second;
        //         second=arr[i];
                     
        //     }
        //     else if(arr[i]>third && arr[i]<second &&arr[i]<first){
        //         third=arr[i];
        //     }

        //     }
        //     System.out.println(third);

        Arrays.sort(arr);

        int n=arr.length;
        for(int i=n-2;i>=0;i--){

            if(arr[i]!=arr[n-1]){

                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("No Second Largest ");
        }

    }
    

