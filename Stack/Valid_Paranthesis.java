import java.util.*;
public class Valid_Paranthesis {
    public static boolean isValid(String str) {
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            //opening cases
            if(ch=='(' || ch=='{' || ch=='[') {
                s.push(ch);
            }
            else {
                //closing
                if(s.isEmpty()) {
                    return false;
                }
                if( (s.peek() == '(' && ch == ')')  ||  (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']') ) {
                 s.pop();
                }
                else 
                return false;
            }
        }
        if(s.isEmpty()) {
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {
        String str ="({})[]";  //true
        System.out.println(isValid(str));
    }
}
