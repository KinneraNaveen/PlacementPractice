package Backtracking;
import java.util.*;

public class Subset {
    public static void main(String[]args){
        String str="abc";
        findSub(str, 0, "");

    }
    public static void findSub(String str,int i,String cur){
        if(i==str.length()){
            System.out.println(cur);
            return;
        }
        findSub(str, i+1, cur+str.charAt(i));
        findSub(str, i+1, cur);
    } 
    
}
