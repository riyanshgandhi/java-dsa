class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
     
        int size = arr.length;
        d=d%arr.length;
        ArrayList<Integer> temp=new ArrayList<>();
        
        for(int i=d; i<size; i++){
          temp.add(arr[i]);  
        }
        for(int i=0; i<d; i++){
            temp.add(arr[i]);
            
            
        }
        for(int i=0; i<size; i++){
            arr[i]=temp.get(i);
        }
    }
}