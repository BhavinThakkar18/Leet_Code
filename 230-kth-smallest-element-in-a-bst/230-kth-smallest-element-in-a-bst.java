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
public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        helper(root, values);
        return values.get(k-1);
    }
    
    private void helper(TreeNode root, List<Integer> values) {
        if(root == null)
            return;
        
        helper(root.left, values);
        values.add(root.val);
        helper(root.right,values);
    }
}