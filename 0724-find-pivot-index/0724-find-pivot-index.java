class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i : nums)
        {
            totalSum+=i;
        }
        
        int leftSum=0;
        int rightSum=totalSum;
        
        for(int i=0;i<nums.length;i++)
        {
            rightSum-=nums[i];
            if(rightSum==leftSum)
            {
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}