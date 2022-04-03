class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n==1)
            return;
        int i=1;
        int lastInc = -1;
        while(i<n) // find the last peak
        {
            if(nums[i]>nums[i-1])
            {
                lastInc=i;
            }
            i++;
        }
        if(lastInc==-1) // if array is in DSC
        {
            for(i=0;i<n/2;i++)
            {
                int temp=nums[n-i-1];
                nums[n-i-1]=nums[i];
                nums[i]=temp;
            }
            return;
        }
        int mn=nums[lastInc];
        int index=lastInc;
        for(i=lastInc;i<n;i++)
        {
            if(nums[i]>nums[lastInc-1] && nums[i]<nums[index])
            {
                index=i;
            }
        }
        int temp=nums[index];
        nums[index]=nums[lastInc-1];
        nums[lastInc-1]=temp;
        Arrays.sort(nums,lastInc,nums.length);
        return;
    }
}