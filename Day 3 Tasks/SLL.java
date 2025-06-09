package addon;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.add(4);
        list.add(2);
        list.add(10);
        list.add(7);
        list.display();
    }
}