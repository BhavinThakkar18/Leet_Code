class Solution {
    private static boolean isItPalindrom(String s)
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
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String temp=s.substring(i,j);
                if(isItPalindrom(temp))
                //System.out.println(temp);
                {
                    ans++;
                }
            }
        }
        return ans;
        
    }

}