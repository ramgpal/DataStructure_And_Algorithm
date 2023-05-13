import java.util.*;
public class QueueUsingArray {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = 0;
        }
        
        public boolean isEmpty() {
            return rear == 0;
        }
        
        public void add(int data) {
            if (rear == size) {
                System.out.println("Queue is full");
                return;
            }
            
            arr[rear] = data;
            rear++;
        }
        
        public int remove() {   // TC - O(n)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;   
            }
            
            int front = arr[0];
            for(int i=0;i<rear;i++) {
                arr[i] = arr[i+1];
            }
            rear -= 1;
            
            return front;
        }
        
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    }