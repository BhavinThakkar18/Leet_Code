class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int j=i+1;
            if(nums[i]==nums[j])
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}