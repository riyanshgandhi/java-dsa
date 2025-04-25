
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n= arr.length;
        HashSet<Integer> yoo= new HashSet<>();
        
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                yoo.add(arr[i]);
            }
        }
        for(int i=1; i<=1000000; i++){
            if(!yoo.contains(i)){
                return i;
            }
        }
        return 1000001;
    }
}