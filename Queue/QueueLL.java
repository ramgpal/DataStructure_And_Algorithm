import java.util.*;
public class QueueLL {

    //for LL initialization
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head;
        static Node tail;
        public static boolean isEmpty() {
        return head == null && tail == null; 
        }

        //Adding data to Queue
        public static void enqueue(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //removind data from Queue
        public static int dequeue() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head) {
                tail = head = null;
            }
            else {
                head = head.next;
            }
            return front;
        }

        //showing data
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data; 
        }


        public static void main(String[] args) {
        Queue q = new Queue();
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
