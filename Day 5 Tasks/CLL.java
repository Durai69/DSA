package addon;

public class CLL {
Node head = null;
    // Method to insert a node at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point next to itself to form a circle
        } else {
            Node temp = head;
            // Traverse to last node
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Method to display the circular linked list
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
        CLL cll = new CLL();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        System.out.println("Circular Linked List Elements:");
        cll.display();
    }
}