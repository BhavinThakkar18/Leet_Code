class Solution {
    public int[] runningSum(int[] nums) {
        int temp=0;
        for(int i=1;i<nums.length;i++)
        {
            temp=nums[i];
            nums[i]=temp+nums[i-1];
        }
        return nums;
    }
}