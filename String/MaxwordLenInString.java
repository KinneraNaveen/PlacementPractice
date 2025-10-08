package String;

import java.util.*;

public class MaxwordLenInString {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Sentance ");

        String str=sc.nextLine();
        String []arr=str.split("\\s");

        int maxcount=0;
        for(String word:arr){
            if(word.length()>maxcount){
                maxcount=word.length();
            }
        }
        System.out.println(maxcount);

    }
}
