class Solution {
    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
    int res;
    public int subarraySum(int[] nums, int k) {
    int n=nums.length;
    map.put(0,1);
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=nums[i];
        int val=sum-k;
        if(map.containsKey(val))
        {
            res+=map.get(val);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
    return res;
    }
}