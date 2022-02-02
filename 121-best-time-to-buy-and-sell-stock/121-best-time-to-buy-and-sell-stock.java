class Solution {
    public int maxProfit(int[] prices) {
        int size=prices.length;
        int minSoFar=prices[0];
        int maxProfit=0;
        for(int i=0;i<size;i++)
        {
            minSoFar=Math.min(minSoFar,prices[i]);
            int profit=prices[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
   
}