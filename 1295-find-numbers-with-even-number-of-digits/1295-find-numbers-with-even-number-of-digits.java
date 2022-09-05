class Solution {
    public int findNumberOfDigits(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if((findNumberOfDigits(nums[i])%2==0))
            {
                ans++;
            }
        }
        return ans;
    }
}