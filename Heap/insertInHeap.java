import java.util.*;
public class insertInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data) {
            //add at last
            arr.add(data);  //O(1)
            int x = arr.size()-1;
            int parentIndex = (x-1)/2;
           while(arr.get(x) < arr.get(parentIndex)) {  // O(logn)
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(parentIndex));
            arr.set(parentIndex, temp);
           }
        }
    }
    public static void main(String[] args) {
          Heap pq = new Heap();
          pq.add(2);
          pq.add(3);
          pq.add(4);
          pq.add(5);
          pq.add(10);
          pq.add(1);
          whille(!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
          }
    }
}
