import java.util.*;
public class interleaves2Halves {
       public static void Interleaves(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        int count = 0;
        while(count < size/2 ) {
            firstHalf.add(q.remove());
            count++;
        }
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
       }
       public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       Interleaves(q);
       while(!q.isEmpty()) {
        System.out.print(q.remove()+" ");
       }
       }
    }
    
