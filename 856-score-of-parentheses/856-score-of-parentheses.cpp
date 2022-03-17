class Solution {
public:
    int scoreOfParentheses(string s) {
        stack<int> stk;
        stk.push(0);
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='(')
            {
                stk.push(0);
            }
            else
            {
                int innerD=stk.top();
                stk.pop();
                int outerD=stk.top();
                stk.pop();
                stk.push(outerD + max(2*innerD,1));
            }
        }
        return stk.top();
    }
};