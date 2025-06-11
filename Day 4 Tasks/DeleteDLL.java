package addon;

public class DeleteDLL {
	Node head;
    public void insert(int data) {
        Node newNode = new Node(data); // create a new node.
        if (head == null) { // if the head is null, then the new node is the head.
            head = newNode; // head is the new node.
            return;
        }
        Node current = head;
        while (current.next != null) { // traverse the list until the last node.
            current = current.next;
        }
        current.next = newNode; // add new node at the end.
        newNode.prev = current; // previous node of the new node is current node.
    }     
    
    public void deletemiddle() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        // Find length
        int length = 0;//start length from 0.
        Node current = head; // start from the head node.
        while (current != null) { // traverse the list until the last node.
            length++; // increment the length.
            current = current.next; // move to the next node.
        }
        if (length == 1) { // If there's only one node, delete it.
            System.out.println("Middle node with value " + head.data + " deleted."); // print the value of the node being deleted.
            head = null; // set head to null.
            return;
        }
        int mid = length / 2; // For even, deletes the second middle
        current = head; // start from the head node again.
        for (int i = 0; i < mid; i++) { // traverse to the middle node.
            current = current.next; // move to the next node.
        }
        if (current.prev != null) { // If current is not the head node.
            current.prev.next = current.next; //
        } else {
            head = current.next; // set head to the next node.
            
        }
        if (current.next != null) {// If current is not the last node.
            current.next.prev = current.prev; //
        }
        System.out.println("Middle node with value " + current.data + " deleted."); // print the value of the node being deleted.
    }

    	public void display() {
    		Node current = head; // start from the head node.
			while (current != null) { // traverse the list until the last node.
				System.out.print(current.data + " "); // print the data of the current node.
				current = current.next; // move to the next node.
			}
			System.out.println();// Method to display the list.
    	}
    		public static void main(String[] args) {
    			DeleteDLL list = new DeleteDLL(); // create an instance of the class.
    			list.insert(10); // insert the first node.
    			list.insert(20); // insert the second node.
    			list.insert(30); // insert the third node.
    			list.insert(40); // insert the fourth node.
    			list.insert(50); // insert the fifth node.
    			System.out.println("Original List:");
    			list.display(); // display the list.
    			list.deletemiddle(); // delete the middle node.
    			System.out.println("List after deleting the middle node:");
    			list.display(); // display the list after deleting the middle node.
    			
    		}
    	
    	

  	
    	
    

}
