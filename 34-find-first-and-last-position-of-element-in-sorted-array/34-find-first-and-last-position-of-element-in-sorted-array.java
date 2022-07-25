class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int i=0;
        int j=nums.length-1;
        while(i<nums.length && j>=0)
        {
            if(nums[i]==target && ans[0]==-1)
            {
                ans[0]=i;
            }
            if(nums[j]==target && ans[1]==-1)
            {
                ans[1]=j;
               
            }
            i++;
            j--;
        }
        return ans;
    }
}