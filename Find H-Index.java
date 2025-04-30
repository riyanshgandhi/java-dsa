class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int min=0;
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            int match= Math.min(citations[i], n-i);
            min=Math.max(match,min);
    }
    return min;
    }
}