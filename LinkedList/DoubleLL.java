import java.util.*;
public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
        head = tail = newNode;
        return;
    } 
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
}

//addLast

//removeFirst
public int removeFirst() {
if(head == null) {
    System.out.println("LL is empty");
    return Integer.MIN_VALUE;
}
if(size ==1) {
    int val = head.data;
    head = tail = null;
    size--;
    return val;
}
int val = head.data;
head = head.next;
head.prev = null;
size--;
return val;
}
     //print
     public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL(); 
       dll.addFirst(1);
       dll.addFirst(2);
       dll.addFirst(3);
       dll.print();
       System.out.println("After adding first LL size is: "+dll.size);
       dll.removeFirst();
       dll.print();
       System.out.println("After removing first size is: "+dll.size);
    }    
}
