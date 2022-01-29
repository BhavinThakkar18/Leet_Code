class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int ans=1;
        if(nums[l-1]==nums[0])
        {
            return nums[0];
        }
        else
        {
            for(int i=(nums[l-1]/2+1);i>0;i--)
            {
                if(nums[l-1]%i==0 && nums[0]%i==0)
                {
                    ans=i;
                    break;
                }
            }
            return ans;
        }  
    } 
}