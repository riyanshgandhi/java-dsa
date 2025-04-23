class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int totalprofit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                // min value=i;
                totalprofit+=prices[i]-prices[i-1];
            }
        }
         return totalprofit;
    }
}