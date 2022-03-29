class Solution {
    public boolean isCntOfElementsLessThanMid(int mid,int[] nums)
    {
        int cnt =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=mid)
            {
                cnt++;
            }
        }
        return (cnt<=mid);
    }
    public int findDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(isCntOfElementsLessThanMid(mid,nums)==true)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return l;
    }
}