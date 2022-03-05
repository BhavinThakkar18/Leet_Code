class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] freq = new int[10001];
        int[] dp = new int[10001];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        dp[1]=freq[1];
        for(int i=2;i<=10000;i++)
        {
            dp[i]=Integer.max(dp[i-1],i*freq[i]+dp[i-2]);
        }
        return dp[10000];
    }
}