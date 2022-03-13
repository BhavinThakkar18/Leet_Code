class Solution {
    public boolean buddyStrings(String s, String goal) {
        int count = 0;
        int temp = 0;
        if(s.length() != goal.length())
            return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                count += 1;
                if(count == 2){
                    if(s.charAt(temp) != goal.charAt(i) || s.charAt(i) != goal.charAt(temp))
                        return false;
                }
                temp = i;
            }
        }
        if(count == 2)
            return true;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<goal.length(); i++){
            set.add(Character.toString(goal.charAt(i)));
        }
        return (count == 0 && set.size() < goal.length()) ? true : false;
    }
}