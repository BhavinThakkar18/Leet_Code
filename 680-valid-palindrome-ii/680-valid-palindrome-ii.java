class Solution {
    public boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                String leftSub = s.substring(i+1,j+1);
                String rightSub = s.substring(i,j);
                return isPalindrome(leftSub) || isPalindrome(rightSub);
            }
            i++;
            j--;
        }
        return true;
    }
}