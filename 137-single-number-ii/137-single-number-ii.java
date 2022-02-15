class Solution {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for(int i=0;i<32;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if ((nums[j] & (1 << i)) != 0)
                count[i] += 1;
            }
            
        }
        int ans = 0;
        for(int i=0;i<32;i++)
        {
            ans+= ((count[i] % 3) * (1 << i));
        }
        return ans;
    }
}