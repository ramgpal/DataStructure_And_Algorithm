import java.util.*;
public class validAnagrams {
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0; i< t.length();i++) {
            char ch = t.charAt(i);
            if(map.get(ch) != null) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                }
                else {
                    map.put(ch, map.get(ch)-1);
                }
            }
             else {
                System.out.println("False");
                break;
            } 
        }
        if(map.isEmpty()) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
        
}
}
