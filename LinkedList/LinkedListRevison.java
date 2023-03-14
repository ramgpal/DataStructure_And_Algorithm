import java.util.*;
public class LinkedListRevison
{
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
//addFirst
    public void addFirst(int data) {
        //creating a Node
        Node newNode=new Node(data);
        if(head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    //addLast
    public void addLast(int data) {
        //creating a new node
        Node newNode=new Node(data);
        if(head==null) {
            head=tail=newNode;
        }
            tail.next=newNode;
            tail=newNode;
        }
        
        //printing the LL 
        public void printLL() {
            Node temp=head;
            if(head==null) {
                System.out.println("LL is empty");
                return;
            }
            while(temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        
       //add in the Middle of LL
       public void addMiddle(int idx, int data) {
           if(idx==0) {
               addFirst(data);
               return;
           }
           Node newNode=new Node(data);
           Node temp = head;
           int i=0;
           while(i<idx-1) {
               temp=temp.next;
               i++;
           }
           newNode.next=temp.next;
           temp.next=newNode;
       }
	public static void main(String[] args) {
	LinkedListRevison LL = new LinkedListRevison();
	LL.printLL();
	LL.addFirst(1);
	LL.printLL();
	LL.addFirst(2);
	LL.printLL();
	LL.addLast(3);
    LL.printLL();
	LL.addLast(4);
	LL.printLL();
	LL.addMiddle(2,9);
	LL.printLL();
    LL.addMiddle(0,7);
	LL.printLL();
	}
}
