class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        S = S.replaceAll("-","");
        StringBuilder sb =new StringBuilder(S);
        
        for(int i=S.length()-K;i>0;i-=K)
        {
            sb.insert(i,"-");
        }
        return sb.toString();
    }
}