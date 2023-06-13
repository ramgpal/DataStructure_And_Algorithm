import java.util.*;
public class DeleteANode {
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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
// To delete node of a BST
   public static Node delete(Node root, int val) {
    //Searching for node to delete
    if(val > root.data) {
        root.right = delete(root.right, val);
    }
    else if(val < root.data) {
        root.left = delete(root.left, val);
    } else {  //Voila 

        // Case 1 - Node having zero child (Leaf Node)
        if(root.left == null && root.right == null) {
            return null;
        }

        // Case 2 - Node having one child
        if(root.left == null) {
            return root.right;
        }
        else if (root.right == null){
            return root.left;
        }
        // Case 3 - Node having two child
        Node IS = findInorderSuccessor(root.right);   // InorderSuccessor - left most node in right subtree
        root.data = IS.data;
        root.right = delete(root.right, IS.data);
    }
    return root;
   }
   public static Node findInorderSuccessor(Node root) {
    while(root.left != null) {
        root = root.left;
    }
    return root;
   }
    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 1);
        inorder(root);
        System.out.println();
    }
}

