class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans=0;
        while(target>startValue)
        {
            if((target & 1)==1)
            {
                target+=1;
                ans++;
            }
            target>>=1;
            ans++;
        }
        return ans+startValue-target;
    }
}