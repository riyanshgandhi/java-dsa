class Solution {
    public int findMin(int[] arr) {
        // complete the function 
      int min= Integer.MAX_VALUE;
      
      for(int i:arr){
          if(i<min){
              min=i;
          }
      }
      return min;
    }
}
