class Solution {
    public int minOperations(String[] logs) {
        if(logs.length==0){
            return 0;
        }
        
        int count=0;
        Stack<String> stk=new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!stk.isEmpty() && logs[i].equals("../")){
                   stk.pop(); 
            }
            
            else if(logs[i].equals("./")){
                continue;
            }
            else if(!logs[i].equals("./") && !logs[i].equals("../")){
                stk.push(logs[i]);
            }
        }
        
        // System.out.println(stk);
        
        return stk.size();
    }
}