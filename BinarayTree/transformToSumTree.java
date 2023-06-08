import java.util.*;

public class transformToSumTree {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        int newLeftSum = root.left == null ? 0 : root.left.data;
        int newRightSum = root.right == null ? 0 : root.right.data;

        int data = root.data;
        root.data = leftSum + newLeftSum + rightSum + newRightSum;
        return data;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Sum(root);
        preorder(root);
    }
}
