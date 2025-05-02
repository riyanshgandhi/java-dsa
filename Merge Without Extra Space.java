class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        
        int i=n-1;
        int j=0;
        
        while(i>=0 && j<m){
            if(a[i]>b[j]){
            b[j]=a[i]+b[j];
            a[i]=b[j]-a[i];
            
            b[j]=b[j]-a[i];
            i--;
            j++;}
        else{
            break;
        }
        }
        Arrays.sort(a);
        Arrays.sort(b);
            // System.out.println(a,b);
        
    }
}
