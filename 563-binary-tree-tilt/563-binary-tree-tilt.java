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
    int result=0;
    int findResult(TreeNode root)
    {
        int left=root.left!=null ? findResult(root.left):0;
        int right=root.right!=null ? findResult(root.right):0;
        result+=Math.abs(left-right);
        return left+right+root.val;
    }
    public int findTilt(TreeNode root) {
        if(root!=null) findResult(root);
        return result;
    }
}