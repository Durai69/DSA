package datastructures;
import java.util.Scanner;

public class StackDSA {
    int top = -1, MAX = 1000;
    int[] stack = new int[MAX];

    boolean isEmpty() { return top < 0; }

    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        stack[++top] = x;
        System.out.println(x + " pushed.");
        return true;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    void display() {
        if (isEmpty()) System.out.println("Stack is empty.");
        else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackDSA s = new StackDSA();
        Scanner sc = new Scanner(System.in);
        int choice, val;

        do {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    val = s.pop();
                    if (val != -1) System.out.println("Popped: " + val);
                    break;
                case 3:
                    val = s.peek();
                    if (val != -1) System.out.println("Top: " + val);
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}

