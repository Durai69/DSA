package addon;

public class CircularLinkedListInsertHead {
    // Node class for the circular linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert data at the head of the circular linked list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Single node points to itself
        } else {
            Node temp = head;
            // Traverse to last node to update its next pointer
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;   // Last node points to new head
            newNode.next = head;   // New node points to old head
            head = newNode;        // Update head to new node
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
        CircularLinkedListInsertHead cll = new CircularLinkedListInsertHead();
        cll.insertAtHead(40);
        cll.insertAtHead(30);
        cll.insertAtHead(20);
        cll.insertAtHead(10);

        System.out.println("Circular Linked List (Insert at Head):");
        cll.display();
    }
}