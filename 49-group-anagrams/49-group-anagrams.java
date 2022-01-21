class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String s:strs)
        {
            //sorting each string alphabetically 
            char [] tempArray = s.toCharArray();
            Arrays.sort(tempArray);
            
            //mapping each sorted string 
            String key = new String(tempArray);
            if(map.containsKey(key))
            {
                map.get(key).add(s);
            }
            else
            {
                List<String> strList = new ArrayList<>();
                strList.add(s);
                map.put(key,strList);
            }
            
        }
        ans.addAll(map.values());
        return ans;

    }
}
