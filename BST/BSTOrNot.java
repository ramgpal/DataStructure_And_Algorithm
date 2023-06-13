import java.util.*;
public class BSTOrNot {
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

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // right subtree
        if (val > root.data) {
            root.right = Insert(root.right, val);
        }
        // left subtree
        else {
            root.left = Insert(root.left, val);
        }
        return root;
    }

// BST or not?
    public static boolean isBST(Node root)
    {
     if(root == null) {
         return true;
     } 
     if(root.left != null && maxValue(root.left) >= root.data) {
         return false;
     }
     if(root.right != null && minValue(root.right) < root.data) {
         return false;
     }
     if(isBST(root.left) != true || isBST(root.right) != true) {
         return false;
     }
     return true;
    }
    public static int maxValue(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int value = root.data;
        int rightMax = maxValue(root.right);
        int leftMax = maxValue(root.left);
        return Math.max(value, Math.max(rightMax, leftMax));
    }
    public static int minValue(Node root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int value = root.data;
        int rightMin = minValue(root.right);
        int leftMin = minValue(root.left);
        return Math.min(value, Math.min(rightMin, leftMin));
    } 
    public static void main(String[] args) {
        int[] values = { 1, 1, 6 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        System.out.print(isBST(root));
    }
}

