class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        if(intervals.length==0) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count=0;
        int pre=intervals[0][1];
        
        for(int i=1; i<intervals.length; i++){
            if(pre>intervals[i][0]){
                count++;
            }else {
                pre=intervals[i][1];
            }
        }
        return count;
    }
}