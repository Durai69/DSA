package addon;

public class CircularLinkedListInsertTail {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

   
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode; 
            tail = newNode; 
            tail.next = head; 
        }
    }

   
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
