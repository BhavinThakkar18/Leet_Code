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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean ans=false;
        if(root==null)
        {
            return false;
        }
        else
        {
            targetSum-=(root.val);
            if(targetSum==0 && root.left==null && root.right==null)
            {
                return true;
            }
            if(root.left!=null)
            {
                ans = ans || hasPathSum(root.left,targetSum);
            }
            if(root.right!=null)
            {
                ans = ans || hasPathSum(root.right,targetSum);
            }
        }
        return ans;
    }
}