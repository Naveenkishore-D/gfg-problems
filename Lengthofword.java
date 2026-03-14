public class Lengthofword {
    public int lengthOfLastWord(String s) {//https://neetcode.io/problems/length-of-last-word/question

        int i = s.length() - 1;
        int length = 0;
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
        
    

