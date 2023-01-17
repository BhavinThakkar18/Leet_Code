class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones=0;
        int zeros=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) =='0')
            {
                zeros=Math.min(ones,zeros+1);
            }
            else
            {
                ones++;
            }
        }
        return zeros;
    }
}