import java.util.*;
public class PriorityQeue {
    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.add(3);  //Tc for addition is O(logn)
       pq.add(4);
       pq.add(1);
       pq.add(7);

       while(!pq.isEmpty()) {
        System.out.print(pq.peek()+" ");
        pq.remove();
       }
   } 
}
