import java.util.*;
public class CirculurQueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
          
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }
         
        public boolean isFull() {
            return (rear+1)%size == front;
        }

// Add  TC - O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
//Remove data 
        public int remove() {  // TC - O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;   
            }
           int result = arr[front];
           if(rear == front) {
            rear = front = -1;
           }
           else {
            front = (front+1)%size;
           }
            return result;
        }

//Peek
        public int peek() {
        if (isEmpty()) {
            return -1;
        }
        
        return arr[front];
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    }
    }

