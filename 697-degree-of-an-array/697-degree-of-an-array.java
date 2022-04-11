class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree=0;
        int min_length=0;
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> first_seen = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            first_seen.putIfAbsent(nums[i],i);
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])>degree)
            {
                degree=freq.get(nums[i]);
                min_length=i-first_seen.get(nums[i])+1;
            }
            else if(freq.get(nums[i])==degree)
            {
                min_length=Math.min(min_length,i-first_seen.get(nums[i])+1);  
            }
        }
        return min_length;
    }
}