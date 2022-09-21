class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n>0)
        {
            int last=n&1;
            n=n>>1;
            int second_last=n&1;
            if(last==second_last)
            {
                return false;
            }
        }
        return true;
    }
}