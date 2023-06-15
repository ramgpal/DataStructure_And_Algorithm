import java.util.*;
public class MirrorBST {
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
    public static Node Mirror(Node root) {
        if(root == null) {
            return null;
        }
       Node leftMirror = Mirror(root.left);
       Node rightMirror = Mirror(root.right);

       root.left = rightMirror;
       root.right = leftMirror;
       return root;
    }
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main (String[] args) {
        /*           8
                    / \
                   5   10
                  / \    \
                 3   6    11
   */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        preorder(root);
        System.out.println();
        Mirror(root);
        preorder(root);
        /*           8
                    / \
                   10   5
                  /    / \
                11    6   3
   */
    }
}
