import java.util.*;
public class circularQueueArray {
    public static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int n) {
        arr = new int [n];
        size = n;
        front = -1;
        rear = -1;
        }
        public static boolean isEmpty() {
            return rear == -1;
        }
        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void enqueue(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
            }
            if(front == -1) {
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int dequeue() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(front == rear) {
                front = rear = -1;
            }
            else {
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front]; 
        }
        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }

        }
    }
}