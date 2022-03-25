class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length/2;
        int refund[] = new int[n*2];
        int mincost=0;
        int count=0;
        for(int cost[]:costs)
        {
            refund[count++]=cost[1]-cost[0];
            mincost+=cost[0];
        }
        Arrays.sort(refund);
        for(int i=0;i<n;i++)
        {
            mincost+=refund[i];
        }
        return mincost;
    }
}