package tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.val = data;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {

        TreeNode root = getSampleTree2();
        // inorder(root);
        // preOrder(root);
        // postOrder(root);
        //levelOrderTraversal(root);
		System.out.println(zigzagLevelOrder(root));

    }

    public static TreeNode getSampleTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(4);
        TreeNode left3 = new TreeNode(5);
        TreeNode right2 = new TreeNode(6);
        TreeNode right3 = new TreeNode(7);

        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
        return root;
    }
    public static TreeNode getSampleTree2() {
        TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.left.left = new TreeNode(4);
       root.right = new TreeNode(3);
       root.right.right = new TreeNode(5);

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    public static void preOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> holder = new LinkedList<>();
        holder.add(root);
        while (!holder.isEmpty()) {
            TreeNode temp = holder.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) {
                holder.add(temp.left);
            }
            if (temp.right != null) {
                holder.add(temp.right);
            }
        }
    }


    public static int maxWidth(TreeNode root) {
        int width = 0;
        if (root == null) {
            return width;
        }
        Queue<TreeNode> data = new LinkedList<>();
        data.offer(root);
        while (!data.isEmpty()) {
            int size = data.size();
            if (size > width) {
                width = size;
            }
            for (int i = 0; i < size; i++) {
                TreeNode temp = data.poll();
                if (temp.left != null) {
                    data.offer(temp.left);
                }
                if (temp.right != null) {
                    data.offer(temp.right);
                }
            }
        }
        return width;
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer>levellist=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null)
                    queue.add(temp.left);

                if(temp.right!=null)
                    queue.add(temp.right);

                if(level%2==0)
                    levellist.add(temp.val);
                else
                    levellist.add(0,temp.val);
            }
            level++;
            list.add(levellist);
        }
        return list;
    }
}
