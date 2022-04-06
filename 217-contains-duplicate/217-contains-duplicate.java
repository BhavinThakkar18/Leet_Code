class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;
    }
}