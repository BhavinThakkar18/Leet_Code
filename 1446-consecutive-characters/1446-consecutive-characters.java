class Solution {
    public int maxPower(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        int ans=1;
        for(int i=1;i<s.length();i++)
        {
            
            if(stack.size()>0)
            {
                if(s.charAt(i)==stack.peek())
                {
                    stack.push(s.charAt(i));
                
                }
                else
                {
                    while(!stack.isEmpty())
                    {
                        stack.pop();   
                    }
                    stack.push(s.charAt(i));
                }
            }
            else
            {
                stack.push(s.charAt(i));
                
            }
            ans=Math.max(ans,stack.size());
            
        }
        return ans;
    }
}