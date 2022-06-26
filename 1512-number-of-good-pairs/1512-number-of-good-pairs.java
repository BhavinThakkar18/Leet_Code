class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        int countPair=0;
        for(int i=0;i<nums.length;i++)
        {
            if(hashMap.containsKey(nums[i]))
            {
                int val = hashMap.get(nums[i]);
                countPair+=val;
                hashMap.put(nums[i],val+1);
                
            }
            else
            {
                hashMap.put(nums[i],1);
            }
        }
        return countPair;
    }
}