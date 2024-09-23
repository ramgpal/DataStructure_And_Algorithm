import java.util.*;
public class Trie {
    public static class Node {
        Node children[];
        boolean endOfWord;
        Node () {
            children = new Node[26];
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    public static Node root = new Node();

    // insertion in Trie -> Time complexity will be O(length of largest word)
    public static void insertNode(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            if(curr.children[word.charAt(i) - 'a'] == null) {
                curr.children[word.charAt(i) - 'a'] = new Node();
            }
            curr = curr.children[word.charAt(i) - 'a'];
        }
        curr.endOfWord = true;
    }

    // Searching in Trie -> Time complexity will be O(length of largest word)
    public static boolean search(String str) {
        Node curr = root;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endOfWord;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(String word : words) {
            insertNode(word);
        }

        System.out.println(search("any"));
    }
}
