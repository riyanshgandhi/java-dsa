class Solution {
    public int kthElement(int a[], int b[], int k) {
        
        int [] arr= new int[a.length + b.length];
         
        for(int i=0; i<a.length; i++){
            arr[i]=a[i];}
            
        for(int i=0; i<b.length; i++){
            arr[a.length + i]=b[i];}
            
            Arrays.sort(arr);
            
        return arr[k-1];        
        
    }
}