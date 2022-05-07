class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3)
        {
            return false;
        }
        Deque<Integer> stk = new ArrayDeque<Integer>();
        int k=-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if (k > -1 && nums[k] > nums[i]) {
                return true;
            }
            while (!stk.isEmpty() && (nums[i] > nums[stk.peek()])) {
                k = stk.pop();
            }
            stk.push(i);
        }
        return false;
    }
}