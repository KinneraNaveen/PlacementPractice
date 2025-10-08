package array;
import java.util.*;

public class CountDup {
    public static void countFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+ " :  "+ e.getValue());
        }
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};
        countFreq(arr);
    }
}
