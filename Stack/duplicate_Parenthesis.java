//Return true if a string exists duplicate parenthesis in the expression
import java.util.*;
public class duplicate_Parenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
       //closing
       if(ch==')') {
        int count =0;
        while(s.pop()!='(') {
        count++;
        }
        if(count<1) {
            return true;  //duplicate exists
        }
       }
       else {
       //opening parenthesis, operator & operands push in the stack
       s.push(ch);
       }
        }
        return false;
    }
    public static void main(String [] args) {
        String str = "(a+b))";
        System.out.println(isValid(str));
    }
}
