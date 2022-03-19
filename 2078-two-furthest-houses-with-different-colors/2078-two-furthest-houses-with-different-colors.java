class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        while(i<j)
        {
            if(colors[j]==colors[i])
            {
                i++;
            }
            else
            {
                break;
            }
        }
        int ans=j-i;
        int x=0;
        int y=colors.length-1;
        while(x<y)
        {
            if(colors[x]==colors[y])
            {
                y--;
            }
            else
            {
                break;
            }
        }
        return Math.max(Math.abs(j-i),Math.abs(y-x));
    }
}