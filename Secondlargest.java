import java.util.*;
public class Secondlargest {//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays,Java&sortBy=submissions
   
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}
   
    

