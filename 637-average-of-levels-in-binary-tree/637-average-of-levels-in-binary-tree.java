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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList();
        if(root==null)
            return ans;
        else
        {
            Queue<TreeNode> q = new LinkedList();
            q.add(root);
            double level_sum=0;
            
            // level order traversal
            while(!q.isEmpty())
            {
                level_sum=0;
                int n=q.size();
                for(int i=0;i<n;i++)
                {
                    TreeNode node=q.poll();
                    level_sum+=node.val;
                    if(node.left!=null)
                        q.add(node.left);
                    if(node.right!=null)
                        q.add(node.right);
                }
                double avg=level_sum/n;
                ans.add(avg);
            }      
        }
        return ans;
    }
}