class Solution {
    public int combinationSum4(int[] nums, int target) {
        int N = nums.length;
        int[][]dp =new int[N][target+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<=target;j++){
                dp[i][j] = -1;
            }
        }//init dp
        return func(N-1,target,nums,N,dp);
    }
    
    int func(int index,int target,int[]nums,int N,int[][]dp){
        if(target ==0){
            return 1;
        }
        if(index <0){
            return 0;
        }
        if(dp[index][target] != -1){
            return dp[index][target];
        }
        int take = 0;
        int notTake=0;
        if(target-nums[index]>=0){
            take = func(N-1,target-nums[index] ,nums,N,dp); // if take index will always start from N-1 as we have Infinite Supply.
        }
        if(index-1 >= 0){
            notTake = func(index-1,target,nums,N,dp);
        }
        dp[index][target] = take + notTake;
        return dp[index][target];
    }
}