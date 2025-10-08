package String;
import java.util.*;
public class Anagram {
    public static void main(String[]args){
        String s1="nveen";
        String s2="neevn";
      if (anagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        }
    }
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int arr[]=new int [26];
        for(int i=0;i<s1.length();i++){

            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }

        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
        return true;


        // s1 = s1.toLowerCase();
        // s2 = s2.toLowerCase();

        // if (s1.length() != s2.length()) {
        //     return false;
        // }

        // char[] ch1 = s1.toCharArray();
        // char[] ch2 = s2.toCharArray();

        // Arrays.sort(ch1);
        // Arrays.sort(ch2);

        // return Arrays.equals(ch1, ch2);
           
        }

    }
    

