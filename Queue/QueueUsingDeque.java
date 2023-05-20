import java.util.*;
public class QueueUsingDeque {
        static class Queue {
            Deque<Integer> d = new LinkedList<>();
    
            public void enqueue(int data) {
                d.addLast(data);
            }
    
            public int dequeue() {
                return d.removeFirst();
            }
    
            public int peek() {
                return d.getFirst();
            }
    
            public boolean isEmpty() {
                return d.isEmpty();
            }
        }
    
        public static void main(String[] args) {
            Queue q = new Queue();
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }
        }
    }
    
