class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        boolean ans=true;
        int d=0;
        int copy=x;
        while(x>0)
        {
            d=x%10;
            reverse=reverse*10+d;
            x/=10;  
        }
        if(copy==reverse)
        {
            ans=true;
        }
        else
        {
            ans=false;
        }
        return ans;
    }
}