package addon;



public class InsertDll {
        Node head;
        public void insert(int data) {
            Node newNode = new Node(data); // create a new node.
            if (head == null) { // if the head is null, then the new node is the head.
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) { // traverse the list until the last node.
                current = current.next;
            }
            current.next = newNode; // add new node at the end.
            newNode.prev = current;
        }
        
        public void insertmiddle(int data) {
        	Node NewNode = new Node(data);// create a new node.
        	if (head == null){ 
        		head = NewNode;
        		return;
        	}
        	// to find the length of the list.
        	int length = 0;// set length to 0.
        	Node current = head;// start from the head node.
        	
        	while (current != null) {// traverse the list until the last node.
				length++;// increment the length.
				current = current.next;// move to the next node.
				System.out.println("Length of the List: " + length);
        	}
        	int mid = length / 2;// find the middle of the list.
        	current = head;// start from the head node again.
        	for (int i = 0; i < mid - 1; i++) {// traverse the list until the middle node.
				current = current.next;// move to the next node.
			}
        	
        	NewNode.next = current.next; // next node of the new node is the next node of the current node.
            NewNode.prev = current; // previous node of the new node is the current node.
            if (current.next != null) {//if next node is not null.
                current.next.prev = NewNode;// previous node of the next node is the new node.
            }
            current.next = NewNode;
        }
   	 public void display() { // Method to display the list.
			Node current = head; // start from the head node.
			while (current != null) { // traverse the list until the last node.
				System.out.print(current.data + " "); // print the data of the current node.
				current = current.next; // move to the next node.
			}
			System.out.println(); // print a new line after displaying the list.
		}
   	 		public static void main(String[] args) {
			InsertDll list = new InsertDll(); // create an instance of the class.
			list.insert(10); // insert the first node.
			list.insert(20); // insert the second node.
			list.insert(30); // insert the third node.
			list.display(); // display the list.
			list.insertmiddle(25); // insert a node in the middle.
			list.display(); // display the list again.
		}

}