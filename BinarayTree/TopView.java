import java.util.*;
import java.util.LinkedList;
public class TopView {
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

    static class Info {
        Node node;
        int hd; // horizantal distance

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void Top_View(Node root) {
        // level ordered traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            // null condition
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                // first time hd occuring
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                // Comparison left & right child with min & max
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Top_View(root);
    }
}
