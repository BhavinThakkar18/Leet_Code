class Solution {
    public static int maxOf(int[] A)
    {
        int max=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }
    public static boolean isPossible(int[] A,int M, int res)
    {
        int count=1;
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            if(sum+A[i]>res)
            {
                count++;
                sum=A[i];
            }
            else
            {
                sum+=A[i];
            }
        }
        return count<=M?true:false;
    }
    public int splitArray(int[] nums, int m) {
        int min = maxOf(nums);
        int max = 0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            max+=nums[i];
        }
        while(min<=max)
        {
            int mid = (min+max)/2;
            if(isPossible(nums,m,mid)==true)
            {
                ans=mid;
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return ans;
    }
}