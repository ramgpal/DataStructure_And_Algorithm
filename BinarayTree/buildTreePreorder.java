import java.util.*;
public class buildTreePreorder {
static class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

static class BinaryTee {
    static int index = -1;
    public static Node buildTree(int nodes[]) {
        index++;
        if(nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
}
public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTee tree = new BinaryTee();
    Node root = tree.buildTree(nodes);
    System.out.println(root.data);
}
}