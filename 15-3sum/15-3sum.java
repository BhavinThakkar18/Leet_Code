class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans_arr= new LinkedList();
        
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int l = i+1;
                int r= nums.length -1;
                int sum = 0-nums[i];
                
                while(l<r)
                {
                    if(nums[l]+nums[r]==sum)
                    {
                        ans_arr.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1])r--;
                        l++;
                        r--;
                    }
                    else if (nums[l]+nums[r]>sum)
                    {
                        r--;
                    }
                    else
                    {
                        l++;
                    }
                }
            }
        }
        return ans_arr;
    }
}