class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n =stalls.length;
        if(k==1)
        return Integer.MAX_VALUE;
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int result=1;
        
        while(low<=high){
            int mid= low + (high-low)/2;
            
            if(CPC(stalls, k, mid)){
                result=mid;
                low=mid+1;
                
            }else
            
            high=mid-1;
        }
         return result;
        
    }
    
   static boolean CPC(int[] stalls, int k, int md){
        int cp=1;
        int fp=stalls[0];
        
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-fp>=md){
                cp++;
                fp=stalls[i];
                
                if(cp==k){
                    return true;
                }
            }
        }
        return false;
    } 
}