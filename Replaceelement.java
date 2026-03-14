import java.util.*;
public class Replaceelement {//https://neetcode.io/problems/replace-elements-with-greatest-element-on-right-side/history?list=allNC&submissionIndex=0
     public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
        int  temp=arr[i];
        arr[i]=max;
        max=Math.max(max,temp);
        }
        return arr;
        
    }
}
