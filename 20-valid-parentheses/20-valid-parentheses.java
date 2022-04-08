class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if(s.length() % 2 != 0)
            return false;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='(')|| (s.charAt(i)=='{')|| (s.charAt(i)=='['))
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty()) return false;
                char top=st.peek();
                if((top == '(' && s.charAt(i)==')') || (top=='{' && s.charAt(i)=='}') || (top=='[' && s.charAt(i)==']'))
                {
                    st.pop();
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}