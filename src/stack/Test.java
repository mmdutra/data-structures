package stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		
		try {
		
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
		
		} catch (StackOverflowError error) {
			System.out.println(error.getMessage());
		}
		
		System.out.println(stack.pop() + " poped from stack");
	}

}
