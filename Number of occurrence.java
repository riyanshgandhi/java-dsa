class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        
        for(int i:arr){
            if(target==i){
                count++;
                
            }
        }
    
        return count;
    }
}