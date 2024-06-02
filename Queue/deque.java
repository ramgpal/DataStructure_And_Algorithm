import java.util.*;
import java.util.LinkedList;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        System.out.println(d);
        // d.removeFirst();
        // System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
