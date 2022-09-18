class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        if(nums.length==1)
        {
            ans.add(nums[0]);
            return ans;
        }
        if(nums.length==2)
        {
            if(nums[0]!=nums[1] && nums[0]+1!=nums[1])
            {
                ans.add(nums[0]);
                ans.add(nums[1]);
            }
            return ans;
        }
        
        for(int i=1;i<nums.length-1;i++)
        {
            
            if((i-1)==0 && nums[i-1]!=nums[i]  && nums[i-1]+1!=nums[i])
            {
                ans.add(nums[0]);
            }
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1] && (nums[i]-1)!=nums[i-1] && nums[i]+1!=nums[i+1])
            {
                ans.add(nums[i]);
            }
            if(i==nums.length-2  && (nums[i]!=nums[i+1]) && nums[i]+1!=nums[i+1])
            {
                ans.add(nums[i+1]);
            }
        }
        return ans;
    }
}