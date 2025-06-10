
package addon;

public class DLL {
    class Node {// Node class to represent each node in the doubly linked list.
        int data;// data field to store the value of the node.
        Node prev;// to move to the previous node.
        Node next;//to move to the next node.
        Node(int data) { // Constructor to start.
            this.data = data;// initialize the data field with the given value(present in main method).
        }
    }
    Node head;
    
    public void insert(int data) { // Method to insert a new node.
		Node newNode = new Node(data);//create a new node.
		if (head == null) {// if the head is null, then the new node is the head.
			head = newNode;// head is the new node.
			return;// exit the method.
		}
		Node current = head;// current node is the head node.
		while (current.next != null) {// traverse the list until the last node.
			current = current.next;// move to the next node.
		}
		current.next = newNode; // next node of the head node is the new node (current)
		newNode.prev = current; //current node's previous is the last/head node.
	}
	
	public void display() {// Method to display.
		Node current = head;// start from the head node.
		while (current != null) {
			System.out.print(current.data + " ");// print the data of the current node.
			current = current.next;// move to the next node.
		}
		System.out.println();
	}
	
	public static void main(String[] args) { //
		DLL list = new DLL();// created a instance to use the methods.
		list.insert(10);//insert the first node.
		list.insert(20);
		list.insert(30);
		list.display(); //display the list.
	}
    
   
    
}
   

   
