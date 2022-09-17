class Solution {
    public boolean isSelfDividingNumber(int num)
    {
        int digit;
        int copy=num;
        while(num>0)
        {
            digit=num%10;
            if(digit==0)
            {
                return false;
            }
            if(copy%digit!=0)
            {
                return false;
            }
            num/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDividingNumber(i)==true)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}