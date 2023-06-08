import java.util.*;
public class minDistance {
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
    // LCA - Lowest Common Ancestors
    public static Node LCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLCA = LCA(root.left, n1, n2);
        Node rightLCA = LCA(root.right, n1, n2);

        // leftLCA found but not rightLCA
        if (rightLCA == null) {
            return leftLCA;
        }
        // rightLCA found but not leftLCA
        if (leftLCA == null) {
            return rightLCA;
        }
        return root;
    }
    public static int lcaDistance(Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int leftDist = lcaDistance(root.left, n);
        int rightDist = lcaDistance(root.right, n);
        if(leftDist == -1 && rightDist == -1) {
            return -1;
        }
        if(leftDist == -1) {
            return rightDist+1;
        }
        else {
            return leftDist+1;
        }
    }

    public static int minDista(Node root, int n1, int n2) {
        Node lca = LCA(root, n1, n2);
        int dist1 = lcaDistance(lca, n1);
        int dist2 = lcaDistance(lca, n2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 6;
        System.out.print("Minimum distance between n1 & n2 is: "+minDista(root, n1, n2));
    }
}
