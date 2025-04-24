class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int cur_sum=arr[0];
        int max_sum=arr[0];
        for(int i=1; i<arr.length; i++){
      
        cur_sum= Math.max(arr[i], cur_sum + arr[i]);
        max_sum= Math.max(max_sum, cur_sum);
        }
        return max_sum;
    }
}
