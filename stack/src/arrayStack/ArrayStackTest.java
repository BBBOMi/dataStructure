package arrayStack;

public class ArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stackSize = 5;
		char deletedItem;
		ArrayStack stack = new ArrayStack(stackSize);
		
		stack.push('A');
		stack.printStack();
		
		stack.push('B');
		stack.printStack();
		
		stack.push('C');
		stack.printStack();
		
		deletedItem = stack.pop();
		if(deletedItem != 0)
			System.out.println("삭제된 아이템: " + deletedItem);
		stack.printStack();

	}

}
