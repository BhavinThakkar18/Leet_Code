/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        
        if(root==null)
        {
            return ans;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int currSize = queue.size();
            
            List<Integer> currentLevel = new ArrayList<>();
            
            while(currSize>0)
            {
                Node currNode = queue.remove();
                currentLevel.add(currNode.val);
                for(Node currChild : currNode.children){
                    queue.add(currChild);
                }
                currSize-=1;
            }
            ans.add(currentLevel);
            
        }
        return ans;
    }
    
}