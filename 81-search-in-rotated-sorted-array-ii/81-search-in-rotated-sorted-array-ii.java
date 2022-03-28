class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            if(nums[i]==target || nums[j]==target)
            {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}