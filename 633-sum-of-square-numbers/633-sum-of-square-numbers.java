class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left<=right)
        {
            long total = left*left + right*right;
            
            if(total==c)
            {
                return true;
            }
            else if(total>c)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        System.out.print(left+" "+right);
        return false;
    }
}