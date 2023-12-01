
  
  class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public  class twoHalves {

    public static void splitCircularLinkedList(Node head) {
        if (head == null)
            return;

        Node slowPtr = head;
        Node fastPtr = head;

        // Move fastPtr to the end and slowPtr will be at the middle
        while (fastPtr.next != head && fastPtr.next.next != head) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

       
        if (fastPtr.next.next == head) {
            fastPtr = fastPtr.next;
        }

        // Assigning the starting node of the second half
        Node secondHalf = slowPtr.next;

        // Make the second half circular
        fastPtr.next = secondHalf;

        // Make the first half circular
        slowPtr.next = head;

        // Printing first half
        Node temp = head;
        System.out.println("First Half:");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head && temp != secondHalf);

        System.out.println();

        // Printing second half
        System.out.println("Second Half:");
        temp = secondHalf;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head && temp != secondHalf);

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // Making it circular

        splitCircularLinkedList(head);
    }
}

