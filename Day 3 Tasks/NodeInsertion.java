package addon;

public class NodeInsertion {
    Node head;
    
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) { 
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 0;
        
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds. Appending at the end.");
            current = head;
            if (current == null) {
                head = newNode; 
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode; 
            }
            return;
        }
        newNode.next = current.next;
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
    	NodeInsertion list = new NodeInsertion();
        list.insertAtPosition(10, 0); 
        list.insertAtPosition(20, 1);
        list.insertAtPosition(5, 0);  
        list.insertAtPosition(15, 2);
        list.insertAtPosition(25, 10);
        list.display();
    }
}
