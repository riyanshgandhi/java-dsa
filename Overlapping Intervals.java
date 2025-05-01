class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> ans= new ArrayList<>();
        int n = arr.length;
         
         Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
         
         for(int[] i: arr){
             if(ans.isEmpty() || ans.get(ans.size()-1)[1]<i[0]){
                 ans.add(i);
             }
             else {
                 ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1], i[1]);
             }
         }  
        //  return ans.toArray(new int[ans.size()][]);
        return ans;
    }
}