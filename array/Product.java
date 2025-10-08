package array;
import java.util.*;
public class Product {
    public static int[] Mul (int []arr){
        int n=arr.length;
        int []arr2=new int[n];
         
        for(int i=0;i<n;i++){
             int start=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    start*=arr[j];
                }
                arr2[i]=start;
            }
        }
        return arr2;

        
    }
    public static void main(String[]args){
        int []arr={1,2,3,4};
        int []output=Mul(arr);
        for(int i:output){
            System.out.print(i+" ");
        }

    }
    
}
