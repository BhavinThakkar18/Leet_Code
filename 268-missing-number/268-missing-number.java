class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int ans=0;
        HashSet<Integer> h= new HashSet();
        for(int i=0;i<l;i++)
        {
            h.add(nums[i]);
        }
        for(int i=1;i<=l;i++)
        {
            if(!h.contains(i))
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}