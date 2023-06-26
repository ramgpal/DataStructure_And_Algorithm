// considering Min__Heap
import java.util.*;
public class insertInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data) {
            //add at last
            arr.add(data);  //O(1)
            int x = arr.size()-1;  // x is the child index
            int parentIndex = (x-1)/2;
           while(arr.get(x) < arr.get(parentIndex)) {  // O(logn)
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(parentIndex));
            arr.set(parentIndex, temp);
            x = parentIndex;
            parentIndex = (x-1)/2;
           }
        }
        public int peek() {
            return arr.get(0);
        }
        private void heapify(int i) { // i -> current index or root index
            int left = 2*i+1; 
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if(minIdx != i) {
                //swapping
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                
                heapify(minIdx);
            }

        }
        public int remove() {
            int data = arr.get(0);
            
            //swapping first with last 
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //deleting the last
            arr.remove(arr.size()-1);

            //heapify - CBT maintain rakhna
            heapify(0);
            return data;
        }
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
          Heap h = new Heap();
          h.add(3);
          h.add(4);
          h.add(1);
          h.add(5);
          while(!h.isEmpty()) {
            System.out.print(h.peek()+" ");
            h.remove();
          }
    }
}
