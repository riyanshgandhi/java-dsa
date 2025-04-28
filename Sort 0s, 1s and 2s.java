
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n =arr.length;
        int min=0;
        int mid=0;
        int max=n-1;
        
         while(mid<=max){
             if(arr[mid]==0){
             int temp=arr[mid];
             arr[mid]=arr[min];
             arr[min]=temp;
             min++;
             mid++;}
             else if(arr[mid]==1)
             mid++;
             else if(arr[mid]==2){
             int temp=arr[mid];
             arr[mid]=arr[max];
             arr[max]=temp;
             max--;}
         }
    }
}