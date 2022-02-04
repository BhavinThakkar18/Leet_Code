class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        HashSet<Integer> h= new HashSet();
        int maxSum=0;
        while(right<nums.length)
        {
            int current = nums[right];
            if(!h.contains(current))
            {
                h.add(current);
                sum+=current;
                maxSum=Math.max(sum,maxSum);
                right++;
            }
            else
            {
                int deleteElement=nums[left];
                h.remove(deleteElement);
                sum-=deleteElement;
                left++;
            }
        }
        return maxSum;
    }
}