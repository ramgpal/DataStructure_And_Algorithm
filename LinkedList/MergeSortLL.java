import java.util.*;
public class MergeSortLL {
        public static class Node {
            int data;
            Node next;
        public Node(int data) {
            this.data= data;
            this.next = null;
        }
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data) {
            //step 1 - Create a node
            Node newnode=new Node(data);
            if(head==null) {
                head = tail=newnode;
                return;
            }
            //step 2 - newnode.next=head
            newnode.next=head;
            //step 3
            head=newnode;
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
private Node getMid(Node head){
     //slow-fast approach
     Node slow = head;
     Node fast = head.next;
     while(fast!=null && fast.next!=null) {
         slow=slow.next; //+1
         fast=fast.next.next; //+2
     }
     return slow; //mid Node of LL
 }
 private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }
        temp = temp.next;
    }
    if (head1 != null) {
        temp.next = head1;
    }
    if (head2 != null) {
        temp.next = head2;
    }
    return mergedLL.next;
}
public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    // findMid
    Node mid = getMid(head);
    // left & right MS
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);
    // merge
    return merge(newLeft, newRight);
}
public static void main(String[] args) {
    MergeSortLL ll = new MergeSortLL();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.print();
    ll.head = ll.mergeSort(ll.head);
    ll.print();
}
}



// SortList Leetcode 148 solution
// class Solution {
//     public ListNode sortList(ListNode head) {
//         if (head == null || head.next == null) {
//         return head;
//     }
//     // findMid
//     ListNode mid = getMid(head);
//     // left & right MS
//     ListNode rightHead = mid.next;
//     mid.next = null;
//     ListNode newLeft = sortList(head);
//     ListNode newRight = sortList(rightHead);
//     // merge
//     return merge(newLeft, newRight);
// }
//     private ListNode getMid(ListNode head){
//      //slow-fast approach
//      ListNode slow = head;
//      ListNode fast = head.next;
//      while(fast != null && fast.next != null) {
//          slow=slow.next; //+1
//          fast=fast.next.next; //+2
//      }
//      return slow; //mid Node of LL
//  }
//  private ListNode merge(ListNode head1, ListNode head2) {
//     ListNode mergedLL = new ListNode(-1);
//     ListNode temp = mergedLL;
//     while (head1 != null && head2 != null) {
//         if (head1.val <= head2.val) {
//             temp.next = head1;
//             head1 = head1.next;
//         } else {
//             temp.next = head2;
//             head2 = head2.next;
//         }
//         temp = temp.next;
//     }
//     if (head1 != null) {
//         temp.next = head1;
//     }
//     if (head2 != null) {
//         temp.next = head2;
//     }
//     return mergedLL.next;
// }
// }