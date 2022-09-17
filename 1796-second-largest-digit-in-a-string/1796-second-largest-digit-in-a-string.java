class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int n = Character.getNumericValue(s.charAt(i));
                set.add(n);
            }
        }
        if(set.size()<=1)
            return -1;
        set.pollLast();
        return set.pollLast();
    }
}