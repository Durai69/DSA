package addon;

public class CircularLinkedListDeleteNode {
    // Node class for the circular linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // Insert data at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Single node points to itself
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete the first node found with the given key
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curr = head, prev = null;

        // Case 1: head node holds the key
        if (head.data == key) {
            // Only one node
            if (head.next == head) {
                head = null;
                return;
            }
            // More than one node
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            return;
        }

        // Case 2: node to delete is not the head
        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                return;
            }
        } while (curr != head);

        System.out.println("Node with data " + key + " not found.");
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
        CircularLinkedListDeleteNode cll = new CircularLinkedListDeleteNode();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        System.out.println("Original Circular Linked List:");
        cll.display();

        System.out.println("Deleting node with data 20:");
        cll.delete(20);
        cll.display();

        System.out.println("Deleting node with data 10 (head):");
        cll.delete(10);
        cll.display();

        System.out.println("Deleting node with data 50 (not present):");
        cll.delete(50);
        cll.display();
    }
}