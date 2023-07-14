import java.util.*;
public class shortestPrefixProblem {
    public static class Node {
        Node [] children = new Node[26];
        boolean eow = false;
        int freq;
        Node() {
            for(int i = 0; i< 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void Insert(String s) {
        Node curr = root;
        for(int level = 0; level < s.length(); level++) {
            int idx = s.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            else {
                curr.children[idx].freq++; 
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void  findPrefix(Node root, String ans) {  // O(L) => L; level of the tries
        if(root == null) {
            return;
        }

        if(root.freq == 1) {
            System.out.print(ans+" ");
            return;
        }
        for(int i = 0; i< 26; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"zebra", "dog", "duck", "dove"};
        for(int i = 0; i < arr.length; i++ ) {
            Insert(arr[i]);
        }
        root.freq = -1;

        findPrefix(root, "");
        
    }
}
