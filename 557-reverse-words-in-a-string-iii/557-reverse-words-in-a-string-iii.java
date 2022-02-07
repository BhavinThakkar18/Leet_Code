class Solution {
    public String reverseWords(String s) {
        String[] words;
        words= s.split("\\s");
        String ans="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            for(int j=word.length()-1;j>=0;j--)
            {
                ans+=word.charAt(j);
            }
            if(i!=words.length-1)
            {
                ans+=" ";
            }
        }
        return ans;
    }
}