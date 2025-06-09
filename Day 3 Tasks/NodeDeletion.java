package addon;

public class NodeDeletion {
	  Node head;
	 public void deleteatposition(int position) {
		 if (head == null) {
			 System.out.println("List is empty. Cannot delete.");
		 }
		 
		 if (position < 0) {
			 System.out.println("Invalid position. Cannot delete.");
			 return;
		 }
		 if (position == 0) {
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
			 System.out.println("Position out of bounds. Cannot delete.");
			 return;
		 }
		 Node nodeToDelete = current.next;
		 current.next = nodeToDelete.next;
	 }
	 

		public void insertAtEnd(int data) {
			 Node newNode = new Node(data);
			 if (head == null) {
				 head = newNode;
				 return;
			 }
			 Node current = head;
			 while (current.next != null) {
				 current = current.next;
			 }
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
			 NodeDeletion list = new NodeDeletion();
			 list.insertAtEnd(10);
			 list.insertAtEnd(20);
			 list.insertAtEnd(30);
			 list.display();
			 
			 list.deleteatposition(0);
			 list.display();
			 
			 list.deleteatposition(0);
			 list.display();
			 
			 list.deleteatposition(5); 
		 }
		 
	 }
	 
	  
	  

