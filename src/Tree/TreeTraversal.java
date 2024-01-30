package Tree;

import java.util.Stack;

public class TreeTraversal {

	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.getSampleTree();
		// InorderUsingStack(root)
		System.out.println(maxDepth(root));

	}

	public static void InorderUsingStack(BinaryTreeNode in) {
		Stack<BinaryTreeNode> insertedData = new Stack<>();
		BinaryTreeNode root = in;
		while (true) {
			if (root != null) {
				insertedData.push(root);
				root = root.left;
			} else {
				if (insertedData.isEmpty()) {
					break;
				}
				BinaryTreeNode pop = insertedData.pop();
				System.out.println(pop.data);
				root = pop.right;
			}
		}
	}

	public static int maxDepth(BinaryTreeNode node) {
		if (node == null)
			return 0;
		int lh = maxDepth(node.left);
		int rh = maxDepth(node.right);
		return 1 + Math.max(lh, rh);
	}

}
