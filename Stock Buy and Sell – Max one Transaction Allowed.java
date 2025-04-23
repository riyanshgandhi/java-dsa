class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        if(prices==null || prices.length <= 1){
            return 0;
        }
        int minprices= prices[0];
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            maxprofit= Math.max(maxprofit,prices[i] - minprices);
            minprices= Math.min(minprices, prices[i]);
        }
      return maxprofit;      
    } 
}