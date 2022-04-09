class Solution {
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[k];
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1 );
        }
        Map<Integer, Integer> hm1 = sortByValue(map);
        int index=0;
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) 
        {
            if(k>0)
            {
                ans[index]=en.getKey();
                index++;
                k--;
            }
            //System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
        }
        return ans;
    }
}