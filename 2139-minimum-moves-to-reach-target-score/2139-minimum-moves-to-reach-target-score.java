class Solution {
    private int count=0;
    public int minMoves(int target, int maxDoubles) {
        if(target==1)
        {
            return 0;
        }
        if(maxDoubles==0)
        {
            count+=(target-1);
        }
        else
        {
            if((target&1)==1)
            {
                target-=1;
                if(target>1){
                    minMoves(target,maxDoubles);
                }
                
            }
            else
            {
                target>>=1;
                if(target>1)minMoves(target,maxDoubles-1);
            }
            count++;
        }
        return count;
    }
}