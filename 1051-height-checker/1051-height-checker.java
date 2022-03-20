class Solution {
    public int heightChecker(int[] heights) {
        int ans=0;
        int[] copy=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            copy[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
            if(copy[i]!=heights[i])
            {
                ans+=1;
            }
        }
        return ans;
    }
}