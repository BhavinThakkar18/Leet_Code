/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans= new ArrayList();
        traversal_method(root,ans,0);
        return ans;
    }
    //finding largest value at each level
    public void traversal_method(TreeNode root,List<Integer> ans,int level)
    {
        if(root==null)
            return;
        
        if(level==ans.size())
        {
            ans.add(root.val);
        }
        else
        {
            ans.set(level,Math.max(ans.get(level),root.val));
        }
        traversal_method(root.left,ans,level+1);
        traversal_method(root.right,ans,level+1);
        }
    }
