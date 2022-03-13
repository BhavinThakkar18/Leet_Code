class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;
        Stack<Character> st = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if((ch == ')' && c == '(') || (ch == ']' && c == '[') || (ch == '}' && c == '{'))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();  
    }

}