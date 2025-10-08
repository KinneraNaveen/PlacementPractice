package array;
import java.util.*;
public class MostRepeatedElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of ellement");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Numbers into Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int maxcount=0;
        int mostrepeated=arr[0];
        for(int num:map.keySet()){

            if(map.get(num)>maxcount){
                maxcount=map.get(num);
                mostrepeated=num;
            }
        }

        //  int maxCount = 0;
        // int mostRepeated = arr[0];

        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (arr[i] == arr[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > maxCount) {
        //         maxCount = count;
        //         mostRepeated = arr[i];
        //     }
        // }

 
        System.out.println("MostRepeated value : = "+mostrepeated);


        
    }
    
}
