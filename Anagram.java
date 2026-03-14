import java.util.*;
public class Anagram {//https://neetcode.io/problems/is-anagram/history?list=allNC&submissionIndex=0
     public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
           
            return false;

        }
        char[] a=s.toCharArray();
        char[] b=t. toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
          return true;


        }else{
           return false;


    }
    }
    
}
