package array;

 import java.util.*;

public class MulWithOutSelf {
    public  static int[] productExceptSelf(int[] nums) {

        int []left=new int[nums.length];
        int []right=new int [nums.length];
        int n=nums.length;

        left[0]=1;
        for(int i=1;i<n;i++){//left side values multiply 

            left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;//right side values  multiply
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        int[] res=new int[n];
        for(int i=0;i<n;i++){// multiply  both left and right values

            res[i]=left[i]*right[i];
        }
        return res;     
    }
    public static void main(String[]args){
        int arr[]= {1,2,3,4,5};
          int[] res=productExceptSelf(arr);
              System.out.println(Arrays.toString(res));
    }
    
}
