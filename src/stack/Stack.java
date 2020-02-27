package stack;

public class Stack {
	
	private final int maximum = 100;
	private int[] items;
	private int quantity;
	
	public Stack() {
		this.items = new int[this.maximum];
		this.quantity = -1;
	}
	
	public boolean isEmpty() {
		return (this.quantity < 0);
	}
	
	public boolean push(int value) throws StackOverflowError {
		
		if (this.quantity >= (this.maximum - 1)) {
			throw new StackOverflowError("Stack Overflow - Maximum items exceded! - Item: " + value);
		}
		
		this.items[++this.quantity] = value;
		System.out.println("Value pushed to the stack!");
		
		return true;
	}
	
	public int pop() {
		if (this.quantity < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		int value = this.items[this.quantity--];
		
		return value;
	}
	
	public int peek() {
		if (this.quantity < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 

		int x = this.items[this.quantity]; 
	    return x; 
	}
	
}
