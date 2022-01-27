class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int ans=-1;

        while(i<=j)
        {
            int m=(i+j)/2;
            if(nums[m]==target)
            {
                ans=m;
                break;
            }
            else if(nums[m]<target)
            {
                i=m+1;

            }
            else
            {
                j=m-1;
            }
        }
        return ans;
    }

}