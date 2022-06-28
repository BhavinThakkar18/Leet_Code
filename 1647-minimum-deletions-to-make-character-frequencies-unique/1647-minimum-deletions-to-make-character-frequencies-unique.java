class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        int ans=0;
        int totalSum=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']+=1;
        }
        Set<Integer> seenFreq = new HashSet<Integer>();
        for(int i=0;i<26;i++)
        {
            totalSum+=freq[i];
            while(freq[i]>0 && seenFreq.contains(freq[i]))
            {
                ans+=1;
                freq[i]-=1;
            }
            seenFreq.add(freq[i]);
        }
        for(Integer i:seenFreq)
        {
            //System.out.print("i: "+i+" ");
            sum+=i;
        }
        return totalSum-sum;
    }
}