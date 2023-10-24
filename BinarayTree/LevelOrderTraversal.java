import java.util.*;
public class LevelOrderTraversal {
    public class Node{
        int data;
        Node right;
        Node left;
        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                } 
                if(currNode.right != null) {
                    q.add(currNode.right);
                } 
            }
        }
    }
}
