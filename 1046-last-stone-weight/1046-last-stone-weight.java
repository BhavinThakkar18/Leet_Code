class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i:stones)
        {
            list.add(i);
        }
        while(list.size()>1)
        {
            Collections.sort(list);
            int val = list.get(list.size()-1)-list.get(list.size()-2);
            list.remove(list.size()-1);
            list.remove(list.size()-1);
            if(val>0)
            {
                list.add(val);
            }
        }
        return list.size()==1?list.get(0):0;
    }
}