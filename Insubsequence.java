public class Insubsequence {
     public boolean isSubsequence(String s, String t) {//https://neetcode.io/problems/is-subsequence/question
       
        
        int i = 0;
        int j = 0;
        
        while(i < s.length() && j < t.length()){
            
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            
            j++;
        }
        
        return i == s.length();
    }
    
}
