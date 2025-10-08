package array;
import java.util.*;
public class ArrayCount {

    public List<Integer>findDup(int []arr){

        HashMap<Integer,Integer>h=new HashMap<>();
        
        List<Integer>l=new ArrayList<>();
         for(int n:arr){
            h.put(n,h.getOrDefault(n,0)+1);
            if(h.get(n)==2){
                l.add(n);
            }
         }
         return l;
    }
    public static void main(String[]args){

         ArrayCount sol = new ArrayCount();
        int[] arr = {1, 2, 3, 2, 1, 1, 3};

        List<Integer> result = sol.findDup(arr);
        System.out.println("Repeated elements: " + result);   
    }    
}
