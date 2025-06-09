
package addon;

import java.util.Scanner;

public class RecursiveArrayManipulator {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[100];
    static int size = 0;

    public static void main(String[] args) {
        System.out.println("=== Recursive Array Manipulator ===");
        menu();
    }

    public static void menu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter element to insert: ");
                int elem = sc.nextInt();
                arr[size++] = elem;
                System.out.println("Inserted " + elem);
                break;
            case 2:
                System.out.print("Enter element to delete: ");
                int del = sc.nextInt();
                int idx = search(del, 0);
                if (idx == -1) {
                    System.out.println("Element not found.");
                } else {
                    for (int i = idx; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    size--;
                    System.out.println("Deleted " + del);
                }
                break;
            case 3:
                System.out.print("Enter element to search: ");
                int searchElem = sc.nextInt();
                int foundIdx = search(searchElem, 0);
                if (foundIdx == -1) {
                    System.out.println("Element not found.");
                } else {
                    System.out.println("Element found at index " + foundIdx);
                }
                break;
            case 4:
                System.out.print("Array elements: ");
                display(0);
                System.out.println();
                break;
            case 5:
                System.out.println("Exiting... Thank you!");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        menu();
    }

    
    public static int search(int elem, int index) {
        if (index >= size) return -1;
        if (arr[index] == elem) return index;
        return search(elem, index + 1);
    }

    
    public static void display(int index) {
        if (index >= size) return;
        System.out.print(arr[index] + " ");
        display(index + 1);
    }
}
