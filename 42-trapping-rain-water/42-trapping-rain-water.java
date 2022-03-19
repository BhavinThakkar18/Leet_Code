class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int maxSoFar=height[0];
        int [] right=new int[n];
        for(int i=0;i<n;i++)
        {
            maxSoFar=Math.max(maxSoFar,height[i]);
            left[i]=maxSoFar;
        }
        maxSoFar=height[n-1];
        for(int i=n-1;i>=0;i--)
        {
            maxSoFar=Math.max(maxSoFar,height[i]);
            right[i]=maxSoFar;
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(right[i]+" ");
        // }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;
    }
}