import java.util.*;
public class PalindromeOrNot {
    public static class LinkedList {
        public static class Node {
        int data;
        Node next;
        public Node (int data) {
         this.data=data;
         this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    //add First
    public void addFirst(int data) {
      Node newnode = new Node(data);
      if(head==null) {
        head= tail=newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
    }
    //add Last
    public void addLast(int data) {
        Node newnode = new Node(data);
        if(head==null) {
        head=tail=newnode;
          return;
        }
        tail.next=newnode;
        tail=newnode;
      }
      //print LL
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
    //Palindrome
    // step-1 - findMid
    public Node findMid(Node head) {
        //slow-fast approach
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }
    public static void main (String[] args) {
        LinkedList LL=new LinkedList();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(2);
        LL.addLast(1);
        LL.print();
        LL.findMid(head);
        LL.print();
    }
}
}