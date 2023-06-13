import java.util.*;
public class printInRange {
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
//Making BST
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

    public static void Print_InRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }
        if(root.data >= k1 && root.data <=k2 ) {
           Print_InRange(root.left, k1, k2);
           System.out.print(root.data+" ");
           Print_InRange(root.right, k1, k2);
        }
        else if(root.data < k1) {
            Print_InRange(root.left, k1, k2);
        }
        else if(root.data > k2){
            Print_InRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 1, 3, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Print_InRange(root, 5, 12);
    }
}
