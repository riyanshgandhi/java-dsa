class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
    Arrays.sort(arr);
        int n= arr.length;
        int ans= arr[n-1]- arr[0];
        int smallest= arr[0] + k;
        int largest= arr[n-1] - k;
        int mi, mx;
        
        for(int i=0; i<n-1; i++){
            
            mi= Math.min(smallest, arr[i+1]-k);
            mx= Math.max(largest, arr[i]+k);
            
            if(mi < 0) continue;
            
            ans= Math.min(ans, mx-mi);
        }
return ans;
    }
}
