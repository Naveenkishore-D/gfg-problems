 import java.util.*;
 public class Missing {
    
    int missingNum(int arr[]) {
    
        
      
    
        
        int n = arr.length + 1;
        
        long totalSum = (long)n * (n + 1) / 2;
        long arrSum = 0;
        
        for(int num : arr){
            arrSum += num;
        }
        
        return (int)(totalSum - arrSum);
    }



}
    

