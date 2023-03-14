//Java program to implement Singly LinkedList AddFirst, AddLast, RemoveFirst, RemoveLast, Reverse of LL, DeleteNthNodefromEnd
import java.util.*;
public class LinkedList {
public static class Node {
    int data;
    Node next;
    public Node(int data) {
          this.data=data;
          this.next=null;
    }
}
public static Node head;
public static Node tail;
static int size=1;
//Add node in  First of LL
public void addFirst(int data) {
//step 1 - Create a node
Node newnode=new Node(data);
size++;
if(head==null) {
    head = tail=newnode;
    return;
}
//step 2 - newnode.next=head
newnode.next=head;
//step 3
head=newnode;
}
//Add node in last of LL
public void addLast(int data) {
    //step1 - create a new node
    Node newnode = new Node(data);
    size++;
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
//Add node in the the middle of linkedlist
public void add(int data, int index) {
    if(index==0) {
        addFirst(data);
    return;
    }
    Node newnode = new Node(data);
    size++;
    Node temp = head;
    int i=0;
    while(i<index-1) {
       temp=temp.next;
       i++; 
    }

    //i=index-1
    newnode.next=temp.next;
    temp.next=newnode;
}
//Remove node from the start(first) of LL 
public int removeFirst() {
    if(size==0) {
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1) {
     int val=head.data;
     head=tail=null;
     size=0;
     return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}
//Remove node from the last of LL 
public int removeLast() {
    if(size==0) {
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1) {
     int val=head.data;
     head=tail=null;
     size=0;
     return val;
    }
   //prev : i = size-2
   Node prev=head;
   for(int i=0;i<size-2;i++) {
    prev=prev.next;
   }
   int val = tail.data; // OR prev.next.data
   prev.next=null;
   tail = prev;
   size--;
   return val;
}
//Search data in LL 
public int itrSearch(int key) {
    Node temp=head;
    int i=0;
    while(temp!=null) {
if(temp.data==key) {
    return i;
}
temp = temp.next;
i++;
    }
    return -1;
}
// Reverse of LL
public void Reverse() {
    Node Prev = null;
    Node Curr = tail = head;
    Node Next;
    while(Curr!=null) {
        Next = Curr.next;
        Curr.next = Prev;
        Prev = Curr;
        Curr = Next; 
    }
    head =Prev;
}
//Delete Nth node from end of LL
public void DeleteNthfromEnd(int n) {
    //calculate size
    int size=0;
    Node temp=head;
    while(temp!=null) {
        temp=temp.next;
        size++;
    }
    if(n==size) {
        head=head.next;
        return;
    }
    int i=1;
    Node prev=head;
    while(i<size-n) {
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}
public static void main(String[] args) {
    LinkedList  ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(9,2);
    ll.print();
    ll.removeFirst();
    ll.print();
    ll.removeLast();
    ll.print();
  System.out.println(size); 
  System.out.println("index of key is : "+ll.itrSearch(9));
   ll.Reverse();
   ll.print();
   ll.DeleteNthfromEnd(3);
   ll.print();
}
}
