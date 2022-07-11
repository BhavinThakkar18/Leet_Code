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
public List<Integer> rightSideView(TreeNode root) {
	if(Objects.isNull(root)){
		return Collections.emptyList();
	}

	Queue<TreeNode> bfs = new LinkedList<>();   
	bfs.add(root);
	List<Integer> rightSideNodes = new LinkedList<>();
	while(bfs.size() > 0) {

		rightSideNodes.add(bfs.peek().val);
		int size = bfs.size();
		for(int idx = 0; idx<size; idx++) {

			TreeNode currNode = bfs.peek();
			bfs.poll(); 
			if(currNode.right != null) {
				bfs.add(currNode.right);
			} if(currNode.left != null) {
				bfs.add(currNode.left);
			}
		}   
	}

	return rightSideNodes;
}
}