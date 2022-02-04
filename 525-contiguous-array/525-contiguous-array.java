class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap();
        int count=0;
        int max_length=0;
        counts.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count-=1;
            }
            else
            {
                count+=1;
            }
            if(counts.containsKey(count))
            {
                max_length=Math.max(max_length,i-counts.get(count));
            }
            else
            {
                counts.put(count,i);
            }
        }
        return max_length;
    }
}