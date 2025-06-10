package addon;

import java.util.Scanner;

public class MenuDrivenSinglyLinkedList {
    Node head;


    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            System.out.println("Inserted " + data + " at position " + position);
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Inserted " + data + " at position " + position);
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 0) {
            System.out.println("Deleted " + head.data + " from position " + position);
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        System.out.println("Deleted " + current.next.data + " from position " + position);
        current.next = current.next.next;
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MenuDrivenSinglyLinkedList list = new MenuDrivenSinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data, position;
        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at position");
            System.out.println("2. Delete at position");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position to insert at (0-based): ");
                    position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 2:
                    System.out.print("Enter position to delete from (0-based): ");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}