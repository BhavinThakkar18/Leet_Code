class Solution {
    public boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(String s : words)
        {
            if(isPalindrome(s))
            {
                ans+=s;
                return ans;
            }
        }
        return "";
    }
}