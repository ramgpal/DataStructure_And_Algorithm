import java.util.*;
public class startsWithProblem {
   public static class Node {
    Node [] children = new Node [26];
    boolean eow = false;
    Node () {
        for(int i =0;i<26;i++) {
            children[i] = null;
        }
    }
   }
   public static Node root = new Node();
// Insert in Trie
   public static void insert(String word) {  // O(L):  L->
    Node curr = root;
    for(int level = 0; level < word.length(); level++) {
        int idx = word.charAt(level) - 'a';
        if(curr.children[idx] == null) {
            curr.children[idx] = new Node();
        }
        curr = curr.children[idx];
    }
    curr.eow = true;
   }
//Search in Trie => O(L)
   public static boolean startsWith(String prefix) {  //similiar to search fun.
    Node curr = root;
    for(int i = 0; i<prefix.length();i++) {
        int idx = prefix.charAt(i) -'a';
        if(curr.children[idx] == null) {
            return false;
        }
        curr = curr.children[idx];
    }
    return  true;
   }
   public static void main(String[] args) {
    String[] words = {"apple", "mango", "man", "woman"};
    String prefix = "moon";
    for(int i = 0; i< words.length; i++) {
        insert(words[i]);
    }
    System.out.println(startsWith(prefix));
   }
}

