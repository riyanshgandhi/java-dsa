class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int ts=0;
        int cmax= 0,  max= Integer.MIN_VALUE;
        int cmin= 0,  min= Integer.MAX_VALUE;
    
        for( int num : arr){
            cmax= Math.max(num, cmax+num);
            max= Math.max(max, cmax);
            
            cmin=Math.min(num, cmin+num);
            min= Math.min(min, cmin);
            
            ts+=num;
        }
        if(max<0){
            return max;
        }
        return Math.max(max, ts-min);
    }
}
