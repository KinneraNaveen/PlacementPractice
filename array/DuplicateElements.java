package array;
import java.util.*;
public class DuplicateElements {

    public static void main(String []args){
        int arr[]={1,2,5,6,7,2,1,4,7,4,6};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");
            }
         }
        
        // for(int n:map.keySet()){

        //     if(map.get(n)>1){
        //         System.out.print(n+" ");
        //     }
        // }
    }
    
}
