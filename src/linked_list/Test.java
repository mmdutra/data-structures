package linked_list;

public class Test {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(10);
		list.insert(15);		
		
		list.insertAtStart(20);
		
		list.insertAt(3, 30);
		
		if (list.delete(10)) 
			System.out.println("Item was excluded with success!");
		else
			System.out.println("Could not exclude the item!");
	}
}
