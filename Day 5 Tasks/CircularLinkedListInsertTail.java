package addon;

public class CircularLinkedListInsertTail {
    // Node class for the circular linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    // Insert data at the tail of the circular linked list
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point next to itself for one node
        } else {
            tail.next = newNode; // Current tail's next points to new node
            tail = newNode; // Update tail
            tail.next = head; // Tail's next points to head to keep it circular
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedListInsertTail cll = new CircularLinkedListInsertTail();
        cll.insertAtTail(10);
        cll.insertAtTail(20);
        cll.insertAtTail(30);
        cll.insertAtTail(40);

        System.out.println("Circular Linked List (Insert at Tail):");
        cll.display();
    }
}
