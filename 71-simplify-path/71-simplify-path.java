class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        Stack<String> reverse_st = new Stack<>();
        String ans="/";
        String[] folders=path.split("/*/");
        for(int i=1;i<folders.length;i++)
        {
            // System.out.print(i);
            // System.out.println(folders[i]);
            if(folders[i].equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else if(folders[i].equals("."))
            {
                continue;
            }
            else
            {
                st.push(folders[i]);
            }
        }
        while(!st.isEmpty())
        {
            reverse_st.push(st.pop());
        }
        while(!reverse_st.isEmpty())
        {
            String temp = reverse_st.pop();
            ans+=temp;
            if(reverse_st.size()>0)
            {
                ans+="/";
            }
        }
        
        return ans;
    }
}