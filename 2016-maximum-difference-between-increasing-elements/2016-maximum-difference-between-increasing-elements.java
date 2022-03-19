class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        int ans=-1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
            ans=Math.max(ans,nums[i]-min);
        }
        return ans==0 ? -1 : ans;
    }
}