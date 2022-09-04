class Solution {
    public int findFactorial(int n)
    {
        if(n<=1)
        {
            return 0;
        }
        return ((n)*(n-1))/2;
    }
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]+=1;
        }
        for(int i=1;i<100;i++)
        {
            //System.out.print(freq[i]+" ");
            ans+=findFactorial(freq[i]);
        }
        return ans;
    }
}