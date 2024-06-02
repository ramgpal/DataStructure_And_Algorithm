import java.util.*;
import java.util.LinkedList;
public class queueReversal {
    public static void Reverse(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();
    while(!q.isEmpty()) {
       s.push(q.remove());
    }
    while(!s.isEmpty()) {
        q.add(s.pop());
    }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       Reverse(q);
       while(!q.isEmpty()) {
        System.out.print(q.remove()+" ");
       }
    }
}

