class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i =0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
         PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }
        String ans="";
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();
            
            for (int i = 0; i < entry.getValue(); i++) {
                ans += entry.getKey();
            }
        }
        return ans;
    }
}