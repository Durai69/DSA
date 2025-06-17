package datastructures;

import java.util.Scanner;

public class FrontAndRear {
    int MAX = 1000;
    int front = 0, rear = -1, size = 0;
    int[] queue = new int[MAX];

    boolean isEmpty() { return size == 0; }
    boolean isFull() { return size == MAX; }

    void enqueue(int x) {
        if (isFull()) { System.out.println("Queue Overflow"); return; }
        rear = (rear + 1) % MAX;
        queue[rear] = x;
        size++;
        System.out.println(x + " enqueued.");
    }

    int dequeue() {
        if (isEmpty()) { System.out.println("Queue Underflow"); return -1; }
        int val = queue[front];
        front = (front + 1) % MAX;
        size--;
        return val;
    }

    void display() {
        if (isEmpty()) { System.out.println("Queue is empty."); return; }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++)
            System.out.print(queue[(front + i) % MAX] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        FrontAndRear q = new FrontAndRear();
        Scanner sc = new Scanner(System.in);
        int choice, val;

        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    val = sc.nextInt();
                    q.enqueue(val);
                }
                case 2 -> {
                    val = q.dequeue();
                    if (val != -1) System.out.println("Dequeued: " + val);
                }
                case 3 -> q.display();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
