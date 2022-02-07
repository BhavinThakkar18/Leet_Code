class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //length of the strings
        int s1len=s1.length();
        int s2len=s2.length();
    
        if(s2==null || s2.length()==0 || s1len >s2len)
        {
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26]; 
        
        for(int i=0;i<s1len;i++)
        {
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2len-s1len;i++)
        {
            if(isPermutation(s1Arr,s2Arr))
            {
                return true;
            }
            s2Arr[s2.charAt(i)-'a']--;
            s2Arr[s2.charAt(i+s1len)-'a']++;
        }
        if(isPermutation(s1Arr,s2Arr))
        {
            return true;
        }
        return false;
    }
    public boolean isPermutation(int[] s1Arr, int[] s2Arr)
    {
        for(int i=0;i<s1Arr.length;i++)
        {
            if(s1Arr[i]!=s2Arr[i])
            {
                return false;
            }
        }
        return true;
    }
}