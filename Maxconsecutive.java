public class Maxconsecutive {
    
    public int findMaxConsecutiveOnes(int[] nums) {//https://neetcode.io/problems/max-consecutive-ones/question?list=allNC
        
        int count = 0;
        int max = 0;
         for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }
        }
          return max;
    }
}

    
