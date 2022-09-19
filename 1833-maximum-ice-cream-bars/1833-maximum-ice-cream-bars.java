class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int ans=0;
        while(coins>0 && i<costs.length)
        {
            coins-=costs[i];
            if(coins<0)
            {
                return ans;
            }
            ans++;
            i++;
        }
        return ans;
    }
}