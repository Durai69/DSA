package addon;

 import java.util.Scanner;

 public class MenuDrivenCircularLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

  
    public void insertAtHead(int data) {
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
            head = newNode;
        }
        System.out.println(data + " inserted at head.");
    }

    public void insertAtTail(int data) {
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
        System.out.println(data + " inserted at tail.");
    }

   
    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head, prev = null;

        
        if (head.data == key) {
            if (head.next == head) {
                head = null;
                System.out.println("Node " + key + " deleted.");
                return;
            }
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            System.out.println("Node " + key + " deleted.");
            return;
        }

        
        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                System.out.println("Node " + key + " deleted.");
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
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        MenuDrivenCircularLinkedList cll = new MenuDrivenCircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Insert at Head");
            System.out.println("2. Insert at Tail");
            System.out.println("3. Delete Node");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at head: ");
                    data = sc.nextInt();
                    cll.insertAtHead(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert at tail: ");
                    data = sc.nextInt();
                    cll.insertAtTail(data);
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    data = sc.nextInt();
                    cll.deleteNode(data);
                    break;
                case 4:
                    cll.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
