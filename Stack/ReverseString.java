import java.util.*;

public class ReverseString {
   public static String Reverse(String str) {
    Stack<Character> s = new Stack<>();
    int idx = 0;
    while(idx < str.length()) {
       s.push(str.charAt(idx)); 
       idx++;
    }
    StringBuilder result = new StringBuilder(str.length());
    while(!s.isEmpty()) {
        char temp = s.pop();
        result.append(temp);
    }
   return result.toString();
   }
   public static void main (String[] args) {
    String str = "abc";
    System.out.println(Reverse(str));
   }
}