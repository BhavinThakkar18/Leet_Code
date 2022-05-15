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
    public int deepestLeavesSum(TreeNode root) {  
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level_sum=0;
        while(!queue.isEmpty())
        {
            level_sum=0;
            int n=queue.size();
            for(int i=0;i<n;i++)
            {
                TreeNode currentNode = queue.poll();
                level_sum+=currentNode.val;
                if(currentNode.left!=null)queue.offer(currentNode.left);
                if(currentNode.right!=null)queue.offer(currentNode.right);
            }
        }
        return level_sum;
    }
}