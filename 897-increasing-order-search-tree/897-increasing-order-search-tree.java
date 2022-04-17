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
    //ArrayList<TreeNode> list = new ArrayList<>();
    TreeNode curr=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        TreeNode res=new TreeNode(0);
        curr=res;
         inorder(root);
        // for(int i=0;i<list.size()-1;i++)
        // {
        //     list.get(i).right=list.get(i+1);
        //     list.get(i).left=null;
        // }
        // list.get(list.size()-1).left=null;
        // list.get(list.size()-1).right=null;
        return res.right;
    }
    void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        root.left=null;
        curr.right=root;
        curr=root;
        inorder(root.right);
    }
}