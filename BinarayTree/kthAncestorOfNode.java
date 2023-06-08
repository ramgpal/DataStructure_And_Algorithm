import java.util.*;
public class kthAncestorOfNode {
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
    public static int KthAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int lleftDist = KthAncestor(root.left, n, k);
        int rightDist = KthAncestor(root.right, n, k);
        if(lleftDist == -1 && rightDist == -1) {
            return -1;
        }
        int max = Math.max(lleftDist, rightDist);
        if(max+1 == k) {
            System.out.println(root.data);
        }
        return max+1;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n = 5, k = 2;  // Node 5 ka 2nd Ancestor 
        KthAncestor(root, n, k);
}
}
