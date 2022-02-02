class Solution {
    public int maxProfit(int[] prices) {
        int size=prices.length;
        int[] aux=new int[size];
        int profit=0;
        int maxSoFar=prices[size-1];
        aux[size-1]=maxSoFar;
        for(int i=size-2;i>=0;i--)
        {
            maxSoFar=Math.max(maxSoFar,prices[i]);
            aux[i]=maxSoFar;
        }
        for(int i=0;i<size;i++)
        {
            //System.out.print(aux[i]+" ");
            profit=Math.max(profit,(aux[i]-prices[i]));
        }
         return profit;
    }
   
}