class Solution {
    public int minOperations(String[] logs) {
        if(logs.length==0){
            return 0;
        }
        Stack<String> stk=new Stack<>();
        for(String s:logs){
            if(!stk.isEmpty() && s.equals("../")){
                   stk.pop(); 
            }
            
            else if(s.equals("./")){
                continue;
            }
            else if(!s.equals("./") && !s.equals("../")){
                stk.push(s);
            }
        }
        return stk.size();
    }
}