class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        stack<int> st;
        int pushI=0;
        int popI=0;
        while(pushI<pushed.size())
        {
            st.push(pushed[pushI++]);
            while(st.size() && st.top()==popped[popI])
            {
                popI++;
                st.pop();
            }
        }
        return(st.size()== 0);
    }
};