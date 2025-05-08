class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        if(arr.length==0 || k==0){
            return k;
        }
        if(arr[0]>k){
            return k;
        }
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<=right){
            int mid= left +(right-left)/2;
            int m=arr[mid]-(mid+1);
            
            if(m<k){
                left=mid+1;
            }else{
            right=mid-1;
            }
        }
        if(right<0){
            return k;
        }
        int mmm=arr[right]-(right+1);
        return arr[right]+(k-mmm);
    }
}