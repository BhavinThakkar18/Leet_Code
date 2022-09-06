class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            target.add(index[i],nums[i]);
        }
        int[] result = new int[target.size()];
        int j = 0;
        for(int num : target){
            result[j++] = num; 
        }
        return result;
    }
}