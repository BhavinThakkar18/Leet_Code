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
    int max_width=0;
    HashMap<Integer,Integer> leftmost_positions;
    
    public int widthOfBinaryTree(TreeNode root) {
        max_width=0;
        leftmost_positions=new HashMap();
        getWidth(root,0,0);
        return max_width;
    }
    public void getWidth(TreeNode root,int depth,int position)
    {
        if(root==null) return;
        leftmost_positions.computeIfAbsent(depth,x->position);
        max_width=Math.max(max_width,position-leftmost_positions.get(depth)+1);
        getWidth(root.left,depth+1,position*2);
        getWidth(root.right,depth+1,position*2+1);
    }
}
