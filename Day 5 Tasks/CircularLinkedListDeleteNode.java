package addon;

public class CircularLinkedListDeleteNode {
   
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

   
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curr = head, prev = null;

      
        if (head.data == key) {
           
            if (head.next == head) {
                head = null;
                return;
            }
            
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            return;
        }

       
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
