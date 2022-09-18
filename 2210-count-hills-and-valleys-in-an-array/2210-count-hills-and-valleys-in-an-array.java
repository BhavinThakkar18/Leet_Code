class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int ans = 0;
        for(int i=1;i<n-1;i++)
        {
            int left=i-1;
            int right=i+1;
            
            //finding closest non-equal neighbor on left
            while(left!=0 && nums[left]==nums[i])
            {
                left--;
            }
            //finding closest non-equal neighbor on right
            while(right!=n && nums[right]==nums[i]&& nums[left] == nums[right])
            {
                right++;
            }
            if(left==-1 || right==n)
            {
                continue;
            }
            //checking for hill
            if(nums[i]>nums[left] && nums[i]>nums[right])
            {
                ans++;
                continue;
            }
            //checking for valley
            if(nums[i]<nums[left] && nums[i]<nums[right])
            {
                ans++;
            }
        }
        return ans;
    }
}