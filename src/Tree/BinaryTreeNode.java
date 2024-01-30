package Tree;

public class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public static void main(String[] args) {

		BinaryTreeNode root = getSampleTree();
		// inorder(root);
		// preOrder(root);
		postOrder(root);

	}

	public static BinaryTreeNode getSampleTree() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode left1 = new BinaryTreeNode(2);
		BinaryTreeNode right1 = new BinaryTreeNode(3);
		BinaryTreeNode left2 = new BinaryTreeNode(4);
		BinaryTreeNode left3 = new BinaryTreeNode(5);
		BinaryTreeNode right2 = new BinaryTreeNode(6);
		BinaryTreeNode right3 = new BinaryTreeNode(7);

		root.left = left1;
		root.right = right1;
		left1.left = left2;
		left1.right = right2;
		right1.left = left3;
		right1.right = right3;
		return root;
	}

	public static void inorder(BinaryTreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public static void preOrder(BinaryTreeNode root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(BinaryTreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
}
