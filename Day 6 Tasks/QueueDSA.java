package datastructures;

import java.util.Scanner;

public class QueueDSA {
    int front = -1, rear = -1, MAX = 1000;
    int[] queue = new int[MAX];

    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    boolean isFull() {
        return rear == MAX - 1;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = x;
        System.out.println(x + " enqueued.");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        QueueDSA q = new QueueDSA();
        Scanner sc = new Scanner(System.in);
        int choice, val;

        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    val = q.dequeue();
                    if (val != -1) System.out.println("Dequeued: " + val);
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}

