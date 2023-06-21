import java.util.*;
public class AVLTrees {
    public static class Node {
        int data, height;
        Node right;
        Node left;
        Node(int data) {
            this.data = data;
            height = 1;
        }
    }
   public static Node root;
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        return root.height;
    }

// finding balance factor at each node
    public static int getBalance(Node root) {
        if(root == null) {
            return 0;
        }
        return height(root.left)-height(root.right);
    }

// right rotate subtree rooted with y
   public static Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    /*    Given Tree
            y
           /
          x
           \
            T2
     */
    // performing rotation
    x.right = y;
    y.left = T2;

    //update heights
    y.height = Math.max(height(y.left), height(y.right))+1;
    x.height = Math.max(height(x.left), height(x.right))+1;
    
    //return new root which is x
    return x;
   }

// Left rotate subtree rooted with x
   public static Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    /*    Given Tree
     *      x
     *       \
     *        y
     *       /
     *     T2
     */
    // performing rotation
    y.left = x;
    x.right = T2;

    //update heights
    x.height = Math.max(height(x.left), height(x.right))+1;
    y.height = Math.max(height(y.left), height(y.right))+1;
    
    //return new root 
    return y;
   }


//Insertion

    public static Node insert(Node root, int key) {
        if(root == null) {
            return new Node(key);
        }
        if(key < root.data) {
            root.left = insert(root.left, key);
        }
        else if(key > root.data) {
            root.right = insert(root.right, key);
        }
        else {
            return root; // duplicate keys not allowed
        }
        //update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));
     // get root's balance factor
       int bf = getBalance(root); 
       // LL case
       if(bf > 1 && key < root.left.data) {
        return rightRotate(root);
       }
       //RR case
       if(bf < -1 && key > root.right.data) {
        return leftRotate(root);
       }
       //LR case
        if(bf > 1 && key > root.left.data) {
        root.left =  leftRotate(root.left);
        return rightRotate(root);
       }
       //RL case
        if(bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
        return leftRotate(root);
       }
       return root; // return if AVL is balanced
    }


//preorder
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
/*         AVL Tree
               30
              /  \
            20    40
           /  \     \
         10   25     50
  
 */
     preorder(root);
    }
}
