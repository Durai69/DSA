package datastructures;

public class Stack {
    int mystack[] = new int[5];
    int top = -1;

    public void push(int num) {
        if (top < mystack.length - 1) {
            mystack[++top] = num;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            return mystack[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public void display() {
        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(mystack[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
