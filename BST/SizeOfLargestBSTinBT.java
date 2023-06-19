import java.util.*;
public class SizeOfLargestBSTinBT {
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
    public static class Info {
        boolean isBST;
        int size;
        int minValue;
        int maxValue;
        public Info(boolean isBST, int size, int minValue, int maxValue) {
            this.isBST = isBST;
            this.size = size;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }
    }
    public static int maxSize = 0; 
    public static Info largestBST(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int minValue = Math.min(root.data, Math.min(leftInfo.minValue, rightInfo.minValue));
        int maxValue = Math.max(root.data, Math.max(leftInfo.maxValue, rightInfo.maxValue));
        if(root.data <= leftInfo.maxValue || root.data >= rightInfo.minValue) {
            return new Info(false, size, minValue, maxValue);
        } 
        if(leftInfo.isBST && rightInfo.isBST) {
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, minValue, maxValue);
        }
        return new Info(false, size, minValue, maxValue);
    }
    public static void main (String [] args) {
        /*               50
                      /     \
                    30       60
                   /  \     /  \
                  5    20  45   70
                               /  \
                             65    80       
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
       /*                    60
                            /  \
                          45    70
                               /  \
                             65    80   
                expected BST: size = 5            
        */
        Info info = largestBST(root);
        System.out.print("Largest BST size is: "+ maxSize);
    }
}
