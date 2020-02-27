package linked_list;

public class LinkedList {
	
	public Node head;
	
	private int length(Node node) {
		
		if (node == null)
			return 0;
		
		int count = 0;
		
		Node current = this.head;
		
		while (current != null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	public void insert(int value) {
		Node newNode = new Node(value);
		
		if (this.head == null) {
			this.head = newNode;
		} else {
			this.insertNode(this.head, newNode);
		}
		
		System.out.println("Added to list!");
	}
	
	private void insertNode(Node node, Node newNode) {
		if (node.next == null) 
			node.next = newNode;
		else 
			this.insertNode(node.next, newNode);
	}
	
	public void insertAt(int position, int value) {
		
		int length = this.length(this.head);
		
		if (position > length + 1 || position < 1) {
			System.out.println("Invalid position!");
		}
		
		Node newNode = new Node(value);
		
		if (position == 1) {
			this.head = this.swap(newNode, this.head);
		} else {
			
			Node previous = this.head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			Node current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
	}

	public void insertAtStart(int value) {
		Node newNode = new Node(value);
		
		this.head = this.swap(newNode, this.head);
	}
	
	public boolean delete(int value) {
		
		Node n = this.head;
		
		while (n.next.value != value) {
			n = n.next;	
			
			if (n.next == null)
				break;
		}
		
		if (n.next == null) { 
			return false;
		} else {
			Node excluded = n.next;
			
			n.next = excluded.next;
			
			return true;
		}
	}
	
	public void show(Node node) {	
		System.out.print(node.value);
		
		if (node.next != null) {
			System.out.print(" --> ");
			this.show(node.next);
		}
	}
	
	private Node swap(Node newNode, Node oldNode) {
		newNode.next = oldNode;
		
		oldNode = newNode;
		
		return oldNode;
	}
}
