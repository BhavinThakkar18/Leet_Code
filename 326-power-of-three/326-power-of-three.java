class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>1)
        {
            if(n%3!=0)
            {
                return false;
            }
            else
            {
                n/=3;
            }
        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
}