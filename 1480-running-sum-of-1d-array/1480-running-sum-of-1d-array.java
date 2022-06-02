class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            //temp=nums[i];
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
// Time Complexity: O(N)
// Space Complexity: O(1)