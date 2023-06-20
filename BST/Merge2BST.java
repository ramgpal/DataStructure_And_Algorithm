import java.util.*;
public class Merge2BST {
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
    //Inrder Sequence
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if(root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
 // Merge BSTs
   public static Node Merge(Node root1, Node root2) {
   //step 1 - getInorder
        //for BST1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        //for BST2
         ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
  // Merging both arraylist in sorted order
        ArrayList<Integer> merged = new ArrayList<>();
       int i=0, j=0; 
       while(i<arr1.size() && j<arr2.size()) {
        if(arr1.get(i) <= arr2.get(j)) {
            merged.add(arr1.get(i));
            i++;
        }
        else {
            merged.add(arr2.get(j));
            j++;
        }
       }
       while(i < arr1.size()) {
        merged.add(arr1.get(i));
        i++;
       }
       while(j < arr2.size()) {
        merged.add(arr2.get(j));
        j++;
       }
// Sorted Array -> Balanced BST 
     return  SortedArrayToBst(merged, 0, merged.size()-1);

    }
    public static Node SortedArrayToBst(ArrayList<Integer> arr, int start, int end) {
        if(start > end ) {
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = SortedArrayToBst(arr, start, mid-1);
        root.right = SortedArrayToBst(arr, mid+1, end);
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
        /*
                             2
                            / \
                           1   4
                            BST1
         */
        Node root1 = new Node (2);
        root1.left = new Node(1);
        root1.right = new Node(4);
                /*
                             9
                            / \
                           3   12
                            BST2
         */
        Node root2 = new Node (9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root = Merge(root1, root2);
        preorder(root);
        }
}
