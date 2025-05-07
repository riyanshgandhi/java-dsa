class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
         if(k>n){
             return -1;
         }
        if(k==1){
            int sum=0;
            for(int i=0; i<n; i++ ){
                sum+=arr[i];
            }
            return sum;
        }
        if(k==n){
            int max=arr[0];
            for(int i=1; i<n; i++){
                max= Math.max(max, arr[i]);
            }
            return max;
        }
        int max=arr[0];
        int sum=arr[0];
        for(int i=1; i<n; i++){
            max= Math.max(max, arr[i]);
            sum+=arr[i];
        }
        int low=max;
        int high=sum;
        int result=-1;
        
        while(low<=high){
            int mid=low + (high-low)/2;
            
            if(iP(arr, n, k, mid)){
                result=mid;
                high=mid-1;
                
            }else
            low=mid+1;
        }
        return result;
    
    }
    static boolean iP(int[] arr, int n, int k, int mP){
        int s=1;
        int cP=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mP){
                return false;
            }
            if(cP + arr[i]> mP){
                s++;
                cP=arr[i];
                if(s>k){
                    return false;
                }
                }else{
                    cP+=arr[i];
                
            }
            
        }
        return true;
    }
}