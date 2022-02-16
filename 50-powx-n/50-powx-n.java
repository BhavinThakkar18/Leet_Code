class Solution {
    public double my_pow(double x,long n)
    {
        if(n==0) return 1.0;
        if(n==1) return x;
        if(n<0) return my_pow(1/x,-n);
        double result=my_pow(x*x,n>>1);
        if((n&1)!=0)
        {
            result*=x;
        }
        return result;
    }
    public double myPow(double x, int n) {
        return my_pow(x,n);
    }
}