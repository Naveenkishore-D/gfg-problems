import java.util.HashSet;

public class Duplicatenumber {
      public int findDuplicate(int[] nums) {
      
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        
        return -1;
    }
}
    
    

