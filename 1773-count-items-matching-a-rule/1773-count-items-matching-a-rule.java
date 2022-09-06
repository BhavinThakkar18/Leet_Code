class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        for(int i=0;i<items.size();i++)
        {
            int j=-1;
            if(ruleKey.equals("type"))
            {
                j=0;
            }
            else if(ruleKey.equals("color"))
            {
                j=1;
            }
            else if(ruleKey.equals("name"))
            {
                j=2;
            }
            if(items.get(i).get(j).equals(ruleValue))
            {
                ans++;
            }
        }
        return ans;
    }
}