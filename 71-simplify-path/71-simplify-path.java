class Solution {
    public String simplifyPath(String path) {
        //defining two stacks
        Stack<String> st = new Stack<>();
        Stack<String> reverse_st = new Stack<>();
        
        //intial ans string
        String ans="/";
        
        //spliting input strings
        String[] folders=path.split("/*/");
        
        for(int i=1;i<folders.length;i++)
        {
            //pop the element if we enocounter  /.. (parent folder)
            if(folders[i].equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            //skip if its current folder 
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