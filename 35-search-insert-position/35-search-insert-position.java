class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int ans=nums.length;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}