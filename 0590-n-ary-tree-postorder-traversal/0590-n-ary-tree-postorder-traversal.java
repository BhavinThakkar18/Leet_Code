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
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        dfs(root,ans);
        return ans;
    }
    public void dfs(Node root,List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        
        for(Node child : root.children)
        {
            dfs(child,ans);
        }
        ans.add(root.val);
    }
}