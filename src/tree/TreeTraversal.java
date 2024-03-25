package tree;

import java.util.Stack;

public class TreeTraversal {

	public static void main(String[] args) {
		TreeNode root = TreeNode.getSampleTree();
		// InorderUsingStack(root)
		System.out.println(maxDepth(root));

	}

	public static void InorderUsingStack(TreeNode in) {
		Stack<TreeNode> insertedData = new Stack<>();
		TreeNode root = in;
		while (true) {
			if (root != null) {
				insertedData.push(root);
				root = root.left;
			} else {
				if (insertedData.isEmpty()) {
					break;
				}
				TreeNode pop = insertedData.pop();
				System.out.println(pop.val);
				root = pop.right;
			}
		}
	}

	public static int maxDepth(TreeNode node) {
		if (node == null)
			return 0;
		int lh = maxDepth(node.left);
		int rh = maxDepth(node.right);
		return 1 + Math.max(lh, rh);
	}

}
