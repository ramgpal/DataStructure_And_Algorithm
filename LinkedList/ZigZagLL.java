import java.util.*;
public class ZigZagLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
        this.data = data;
        this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    //Add node in last of LL
public void addLast(int data) {
    //step1 - create a new node
    Node newnode = new Node(data);
   if(head==null) {
    head = tail = newnode;
    return;
   }
//step 2 - tail.next=newnode
tail.next=newnode;
//step 3 - tail=newnode
tail=newnode;
}

//To print LL 
public void print() {
    if(head==null) {
        System.out.println("LL is empty");
        return;
    }
    Node temp=head;
    while(temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}


//Zig-Zag
  public void zigZag() {
    //step1- find mid Node of linkedlist
    Node slow = head;
    Node fast = head;
    while( fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    //step2 - reverse 2nd half
    Node prev = null;
    Node curr = mid.next;
    mid.next = null;
    Node next;
   while(curr != null) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
   }
   //step3 - Alternate merging
   Node leftHead = head;
   Node rightHead = prev;
   Node nextL, nextR;
   // alternate merge
   while (leftHead != null && rightHead != null) {
       nextL = leftHead.next;
       leftHead.next = rightHead;
       nextR = rightHead.next;
       rightHead.next = nextL;
       leftHead = nextL;
       rightHead = nextR;
   }
  }  
  public static void main(String[] args) {
    ZigZagLL ll = new ZigZagLL();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    //1->2->3->4->5
    ll.print();
    ll.zigZag();
    ll.print();
}
}