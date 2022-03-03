class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        int count=0;
        int n = nums.length;
        for(int i=1;i<n-1;i++)
        {
            if(nums[i]-nums[i-1]==nums[i+1]-nums[i])
            {
                count++;
            }
            else
            {
                ans+=(count*(count+1)/2);
                count=0;
            }
        }
        ans+=(count*(count+1)/2);
        return ans;
    }
}