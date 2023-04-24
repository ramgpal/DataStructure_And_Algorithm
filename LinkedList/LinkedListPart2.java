//To detect loop/cycle in linkedList
import java.util.*;
public class LinkedListPart2 {
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
        // Floyd cycle finding algorithm
        public static boolean isCycle() { 
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast ) {
                    return true; //cycle exist
                }
            }
                return false;
            }

            //Remove cycle
            public static void removeCycle() {
               //step1 - detect cycle
               Node slow = head;
               Node fast = head;
               boolean existCycle = false;
               while(fast != null && fast.next != null) {
                   slow = slow.next;
                   fast = fast.next.next;
                   if(slow == fast ) {
                    existCycle = true;
                    break;
                   }
                }
                if(existCycle==false) {
                    return;
                }
               //step2 - find meeting point of slow-fast
                slow = head;
                Node prev = null;
                while(slow != fast) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
               //step3 - removeCycle prev.next = null or last.next=null
              prev.next = null;
            }
            public static void main (String[] args) {
             head = new Node(1);
             Node temp = new Node(2);
             head.next = temp;
             head.next.next = new Node (3);
             head.next.next.next = temp;
           // given LinkedList 1->2->3->2
           System.out.println(isCycle());
           removeCycle();
           System.out.println(isCycle());
            }
        }
    

