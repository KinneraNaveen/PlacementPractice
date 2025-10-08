package String;

import java.util.HashSet;

public class MaxNonrepeating {
   
    public static  int lengthOfLongestSubstring(String s) {
    HashSet<Character>h=new HashSet<>();
    int i=0;
    int start=0;
    int maxLen=0;
    while(i<s.length()){  //starts from first to length of the string 
        if(!h.contains(s.charAt(i))){  //until not repeating it will travel 
            h.add(s.charAt(i));   //add the value into hashset 
            maxLen=Math.max(maxLen,h.size()); //find the max length 
            i++;
        }
        else{
            h.remove(s.charAt(start)); // if repeat means remove first character 
            start++;
        }
    }
    return maxLen;       
    }

    public static void main(String[]args){
        String name="asdfghgfdsa";
        int result=lengthOfLongestSubstring(name);
        System.out.println( result);

    }
    
}
