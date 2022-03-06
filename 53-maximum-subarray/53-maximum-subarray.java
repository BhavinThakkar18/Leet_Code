class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];
            if(currSum >= maxSum)
            {
                maxSum = currSum;
            }
            if(currSum < 0 )
            {
                currSum=0;
            }
        }
        return maxSum;
    }
}