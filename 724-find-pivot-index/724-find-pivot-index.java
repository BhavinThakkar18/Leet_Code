class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++)
        {
            //System.out.print(nums[i]+" ");
            for(int j=0;j<i;j++)
            {
                leftSum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++)
            {
                rightSum+=nums[j];
            }
            if(leftSum==rightSum)
            {
                return i;
            }
            //System.out.println(leftSum+" "+rightSum);
            leftSum=0;
            rightSum=0;
        }
        return -1;
    }
}