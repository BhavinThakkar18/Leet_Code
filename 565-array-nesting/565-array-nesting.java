class Solution {
    public int arrayNesting(int[] nums) {
        int ans=0;
        boolean[] visited=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(!visited[i])
            {
                int len=dfs(nums,i,visited);
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }
    public int dfs(int[] nums,int i,boolean[] visited){
            if(visited[i]) return 0;
            visited[i] = true;
            return 1+dfs(nums,nums[i],visited);
    }
}