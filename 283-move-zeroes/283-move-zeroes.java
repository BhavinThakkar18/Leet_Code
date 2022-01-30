class Solution {
    public void moveZeroes(int[] nums) {
        // having fast and slow pointers initially
        int fast=0;
        int slow=0;
        int temp=0;
        while(fast<nums.length)
        {
            //swapping position for non-zeros and zeros 
            if(nums[fast]!=0)
            {
                temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                ++slow;
            }
            ++fast;
        }
    }
}