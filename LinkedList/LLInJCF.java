import java.util.LinkedList;

import java.util.LinkedList;
public class LLInJCF {
    public static void main (String[] args) {
        //create a LL
        LinkedList<Integer> ll = new LinkedList<>() ;
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
