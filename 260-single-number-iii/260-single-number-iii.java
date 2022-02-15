class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor^=nums[i];
        }
        xor = (xor & -xor);
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]&xor)>0)
            {
                a=a^nums[i];
            }
            else
            {
                b=b^nums[i];
            }
        }
        int[] ans=new int[2];
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}