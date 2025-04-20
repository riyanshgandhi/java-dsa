

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int second_largest= 0;
        int max_value= 0;
        for(int i = 0; i<arr.length; i++){
             if(arr[i]> second_largest){
              if(arr[i]> max_value){
                 second_largest = max_value;
                 max_value=arr[i];
                 
             }else if( arr[i]< max_value){
                 second_largest=arr[i];
             }
        }
        }
        if(second_largest==0){
            return -1;
        }
       return second_largest;
    }
}