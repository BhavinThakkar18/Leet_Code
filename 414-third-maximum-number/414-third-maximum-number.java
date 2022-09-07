class Solution {
    public int thirdMax(int[] nums) {
	nums = Arrays.stream(nums).distinct().sorted().toArray();
        
    if (nums.length == 1) return nums[0];
    if (nums.length == 2) return Math.max(nums[0], nums[1]);

    return nums[nums.length - 3];
    }
}