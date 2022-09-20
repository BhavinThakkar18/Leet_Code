class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                stack.push(nums[i]);
                ans=Math.max(ans,stack.size());
            }
            else
            {
                while(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
        return ans;
    }
}