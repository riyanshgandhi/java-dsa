class Solution {
    int maxProduct(int[] arr) {
        // code here
        if( arr== null || arr.length==0){
            return 0;
        }
        
        int mp= arr[0];
        int cmin=arr[0];
        int cmax=arr[0];
        
        for(int i=1; i<arr.length; i++){
            int tempmin = cmin;
            int tempmax = cmax;
           
           cmax= Math.max(arr[i], Math.max(tempmax*arr[i], tempmin*arr[i]));
           cmin= Math.min(arr[i], Math.min(tempmin*arr[i], tempmax*arr[i]));
           
           mp= Math.max(mp, cmax);
        }
        return mp;
    }
}