class Solution {
    public boolean isAnagram(String s, String t) {
       int[] a = new int[26];
       int[] b = new int[26];
       boolean ans=true;
       for(int i=0;i<s.length();i++)
       {
           
           a[s.charAt(i)-'a']+=1;
       }
       for(int j=0;j<t.length();j++)
       {
           b[t.charAt(j)-'a']+=1;
       }
       for(int i=0;i<26;i++)
       {
           if(a[i]!=b[i])
           {
               ans=false;
               break;
           }
       }
       return ans; 
    }
}