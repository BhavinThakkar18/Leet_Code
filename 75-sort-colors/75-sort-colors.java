class Solution {
    void swap(int i,int j,int[] nums)
    {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public void sortColors(int[] nums) {
        int left = 0;
        int mid  = 0;
        int right = nums.length-1;
        while(mid<=right)
        {
            if(nums[mid]==0)
            {
                swap(mid++,left++,nums);
                
            }
            else if(nums[mid]==1)
            {
                mid++;
                
            }
            else if(nums[mid]==2)
            {
                swap(mid,right--,nums);
                
            }
        }
    }
}