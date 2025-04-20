

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
            j=i;
            break;
            }
        
        }
            if(j==-1)
            return;
      
        for (int r= j+1; r<arr.length; r++){
            if(arr[r]!=0){
                int temp= arr[r];
                arr[r]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
            
   }
}